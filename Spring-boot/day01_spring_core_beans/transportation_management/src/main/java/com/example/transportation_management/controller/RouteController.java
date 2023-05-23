package com.example.transportation_management.controller;

import com.example.transportation_management.model.RouteModel;
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
@RequestMapping("/routes")
public class RouteController {
    RouteService routeService;
    @GetMapping
    public String getRoutes(Model model) {
        List<RouteModel> routeModels = routeService.getAllRoutes();
        model.addAttribute("RouteList", routeModels);
        return "route-list";
    }

    @GetMapping("/create-form")
    public String forwardToCreateForm(Model model) {
        RouteModel routeModel = new RouteModel();
        model.addAttribute("CreateRoute", routeModel);
        return "create-route";
    }

    @PostMapping
    public String createNewRoute(@ModelAttribute("CreateRoute") @Valid RouteModel routeModel, Errors errors, Model model) {
        if (null != errors && errors.getErrorCount() > 0) {
            return "create-route";
        } else {
            routeService.saveRoute(routeModel);
            return "redirect:/routes";
        }
    }

    @GetMapping("/update/{id}")
    public String forwardUpdateForm(@PathVariable int id, Model model) {
        RouteModel routeModel = routeService.findById(id);
        model.addAttribute("RouteEdit", routeModel);
        return "update-route";
    }

    @PostMapping("/update")
    public String updateRoute(@ModelAttribute("RouteEdit") @Valid RouteModel routeModel, Errors errors) {
        if (null != errors && errors.getErrorCount() > 0) {
            return "update-route";
        } else {
            routeService.updateRoute(routeModel);
            return "redirect:/routes";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteRoute(@PathVariable int id) {
        routeService.deleted(id);
        return "redirect:/routes";
    }
}
