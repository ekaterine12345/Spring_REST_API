package com.example.universitymanagement.services;

import com.example.universitymanagement.dtos.ApiResponse;
import com.example.universitymanagement.dtos.UniversityDto;

public interface IUniversityService {

    ApiResponse add(UniversityDto university);

    ApiResponse delete(Long id);

    ApiResponse deleteAll();

    ApiResponse getById(Long id);

    ApiResponse searchByName(String universityName);

    ApiResponse getAll();

    ApiResponse updateName(Long id, String newName);

    ApiResponse update(Long id, UniversityDto university);

}