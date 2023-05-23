package com.example.transportation_management.controller;

import com.example.transportation_management.model.AssignmentSheetModel;
import com.example.transportation_management.model.DriverModel;
import com.example.transportation_management.model.RouteModel;
import com.example.transportation_management.service.AssignmentSheetService;
import com.example.transportation_management.service.DriverService;
import com.example.transportation_management.service.RouteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/assignments")
public class AssignmentSheetController {
    AssignmentSheetService assignmentSheetService;
    DriverService driverService;
    RouteService routeService;

    @GetMapping
    public String getAllAssignments(Model model) {
        List<AssignmentSheetModel> assignmentSheetModels = assignmentSheetService.getAllAssignment();
        model.addAttribute("AssignmentList", assignmentSheetModels);
        return "assignment-list";
    }

    @GetMapping("/create-form")
    public String forwardCreateAssignmentForm(Model model) {
        AssignmentSheetModel assignmentSheetModel = new AssignmentSheetModel();
        getList(model);
        model.addAttribute("CreateAssignment", assignmentSheetModel);
        return "create-assignment";
    }

    @PostMapping
    public String createNewAssignment(@ModelAttribute("CreateAssignment") @Valid AssignmentSheetModel assignmentSheetModel, Errors errors, Model model) {
        if (null != errors && errors.getErrorCount() > 0) {
            getList(model);
            return "create-assignment";
        } else {
            assignmentSheetService.saveAssignment(assignmentSheetModel);
            return "redirect:/assignments";
        }
    }

    @GetMapping("/update/{id}")
    public String forwardUpdateForm(@PathVariable int id, Model model) {
        AssignmentSheetModel assignmentSheetModel = assignmentSheetService.findById(id);
        getList(model);
        model.addAttribute("UpdateAssignment", assignmentSheetModel);
        return "update-assignment";
    }

    @PostMapping("/update")
    public String updateAssignment(@ModelAttribute("UpdateAssignment") AssignmentSheetModel assignmentSheetModel) {
        assignmentSheetService.updateAssignmentSheet(assignmentSheetModel);
        return "redirect:/assignments";
    }

    private void getList(Model model) {
        List<DriverModel> driverModels = driverService.getAllDrivers();
        List<RouteModel> routeModels = routeService.getAllRoutes();

        model.addAttribute("DriverList", driverModels);
        model.addAttribute("RouteList", routeModels);
    }
}
