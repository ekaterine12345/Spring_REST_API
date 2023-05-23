package com.example.universitymanagement.controllers;

import com.example.universitymanagement.dtos.ApiResponse;
import com.example.universitymanagement.dtos.UniversityDto;
import com.example.universitymanagement.services.IUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/university")
public class UniversityController {

    private final IUniversityService universityService; /*
    IUniversityService-ის ინსტანსის დეფენდენსი ინჯექშენი ხდება UniversityController კლასში @Autowired-ის გამოყენებით.
    ანუ აქედან შეგვიძლია წვდომა იმ კლასის(bean) მედოთებზე, რომლებიც IUniversityService-აიმპლემენტირებს
    */

    @Autowired
    public UniversityController(IUniversityService universityService) {
        this.universityService = universityService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public ApiResponse addUniversity(@RequestBody UniversityDto universityDto) {
        return this.universityService.add(universityDto);
    }

    @GetMapping
    public ApiResponse getUniversities() {
        return this.universityService.getAll();
    }

}
