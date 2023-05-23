package com.example.transportation_management.controller;

import com.example.transportation_management.model.DriverModel;
import com.example.transportation_management.service.DriverService;
import com.example.transportation_management.statics.DriverLevel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/drivers")
public class DriverController {
    DriverService driverService;

    @GetMapping
    public String getAllDriver(Model model) {
        List<DriverModel> driverModels = driverService.getAllDrivers();
        model.addAttribute("DriverList", driverModels);
        return "driver-list";

    }

    @GetMapping("/create-form")
    public String forwardCreateForm(Model model) {
        DriverModel driverModel = new DriverModel();
        List<DriverLevel> driverLevels = new ArrayList<>(Arrays.asList(DriverLevel.values()));
        model.addAttribute("DriverLevel", driverLevels);
        model.addAttribute("CreateDriver", driverModel);
        return "create-driver";
    }

    @PostMapping
    public String createNewDriver(@ModelAttribute("CreateDriver") @Valid DriverModel driverModel, Errors errors, Model model) {
        if (null != errors && errors.getErrorCount() > 0 ) {
            List<DriverLevel> driverLevels = new ArrayList<>(Arrays.asList(DriverLevel.values()));
            model.addAttribute("DriverLevel", driverLevels);
            return "create-driver";
        } else {
            driverService.saveDriver(driverModel);
            return "redirect:/drivers";
        }
    }

    @GetMapping("/update/{id}")
    public String forwardUpdateForm(@PathVariable int id, Model model) {
        DriverModel driverModel = driverService.findById(id);
        List<DriverLevel> driverLevels = new ArrayList<>(Arrays.asList(DriverLevel.values()));
        model.addAttribute("DriverLevel", driverLevels);
        model.addAttribute("DriverEdit", driverModel);
        return "update-driver";
    }

    @PostMapping("/update")
    public String updateDriver(@ModelAttribute("DriverEdit") @Valid DriverModel driverModel, Errors errors) {
        if (null!= errors && errors.getErrorCount() > 0) {
            return "update-driver";
        } else {
            driverService.updateDriver(driverModel);
            return "redirect:/drivers";
        }
    }
    @GetMapping("/delete/{id}")
    public String deleteDriver(@PathVariable int id) {
        driverService.deleted(id);
        return "redirect:/drivers";
    }
}

