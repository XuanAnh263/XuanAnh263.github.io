package com.example.bookmanagement.controller;

import com.example.bookmanagement.model.ReaderModel;
import com.example.bookmanagement.service.ReaderService;
import com.example.bookmanagement.statics.ReaderType;
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
@RequestMapping("/readers")
public class ReaderController {
    ReaderService readerService;

    @GetMapping
    public String getAllReader(Model model) {
        List<ReaderModel> readerModels = readerService.getAllReaders();
        model.addAttribute("ReaderList", readerModels);
        return "reader-list";
    }

    @GetMapping("/create-form")
    public String forwardCreateForm(Model model) {
        ReaderModel readerModel = new ReaderModel();
        List<ReaderType> readerTypes = new ArrayList<>(Arrays.asList(ReaderType.values()));
        model.addAttribute("ReaderType", readerTypes);

        model.addAttribute("CreateReader", readerModel);
        return "create-reader";
    }

    @PostMapping
    public String createNewReader(@ModelAttribute("CreateReader") @Valid ReaderModel readerModel, Errors errors, Model model) {
        if (null != errors && errors.getErrorCount() > 0) {
            List<ReaderType> readerTypes = new ArrayList<>(Arrays.asList(ReaderType.values()));
            model.addAttribute("ReaderType", readerTypes);
            return "create-reader";
        } else {
            readerService.saveReader(readerModel);
            return "redirect:/readers";
        }
    }

    @GetMapping("/update/{id}")
    public String forwardUpdateForm(@PathVariable String id, Model model) {
        ReaderModel readerModel = readerService.findById(id);
        List<ReaderType> readerTypes = new ArrayList<>(Arrays.asList(ReaderType.values()));

        model.addAttribute("ReaderType", readerTypes);
        model.addAttribute("ReaderEdit", readerModel);
        return "update-reader";
    }

    @PostMapping("/update")
    public String updateReader(@ModelAttribute("ReaderEdit") @Valid ReaderModel readerModel, Errors errors) {
        if (null != errors && errors.getErrorCount() > 0) {
            return "update-reader";
        } else {
            readerService.updateReader(readerModel);
            return "redirect:/readers";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteReader(@PathVariable String id) {
        readerService.delete(id);
        return "redirect:/readers";
    }
}
