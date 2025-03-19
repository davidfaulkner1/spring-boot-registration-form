package com.davidfaulkner.registration.spring_boot_registration_form.controller;

import com.davidfaulkner.registration.spring_boot_registration_form.entity.CustomerData;
import com.davidfaulkner.registration.spring_boot_registration_form.repository.CustomerDataRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/registration") // Added class-level @RequestMapping
public class RegistrationController {

    @Autowired
    private CustomerDataRepository customerDataRepository;

    @GetMapping
    public String showForm(Model model) { // changed method name
        model.addAttribute("customerData", new CustomerData());
        return "registration";
    }

    @PostMapping
    public String registerCustomer(@Valid @ModelAttribute("customerData") CustomerData customerData, BindingResult bindingResult, Model model) {
    	System.out.println("CustomerData: " + customerData);
        System.out.println("BindingResult: " + bindingResult.getAllErrors());
        
        // Check for duplicate address
        if (customerDataRepository.findAll().stream().anyMatch(existing -> existing.isSameAddress(customerData))) {
            bindingResult.rejectValue("addressLine1", "error.duplicate", "This address already exists.");
        }
        
        if (bindingResult.hasErrors()) {
            return "registration";
        }

        try {
        	customerData.setRegistered(LocalDateTime.now()); // Set the registered field
            customerDataRepository.save(customerData);
            return "success";
        } catch (Exception e) {
            model.addAttribute("errorMessage", "An error occurred during registration: " + e.getMessage());
            return "registration";
        }
    }
}