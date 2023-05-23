package com.example.universitymanagement.services.impl;

import com.example.universitymanagement.dtos.ApiResponse;
import com.example.universitymanagement.dtos.UniversityDto;
import com.example.universitymanagement.models.University;
import com.example.universitymanagement.services.IUniversityService;
import com.example.universitymanagement.utils.UniversitiesUtils;
import org.springframework.stereotype.Service;

@Service
public class UniversityServiceImpl implements IUniversityService {

    private UniversitiesUtils universitiesUtils = UniversitiesUtils.getInstance();

    @Override
    public ApiResponse add(UniversityDto universityDto) {
        if (universityDto == null) {
            return new ApiResponse().addError("universityDto", "object is null");
        }
        University university = new University(universityDto);
        Boolean status = universitiesUtils.addUniversity(university);
        System.out.println(new ApiResponse("status", status)); // ApiResponse(data={status=true}, error={})
        return new ApiResponse("status", status);
    }

    @Override
    public ApiResponse delete(Long id) {
        University university = universitiesUtils.deleteById(id);
        if (university == null) {
            return new ApiResponse().addError("id", "invalid id");
        }
        return new ApiResponse("university", university);
    }

    @Override
    public ApiResponse deleteAll() {
        return null;
    }

    @Override
    public ApiResponse getById(Long id) {
        return null;
    }

    @Override
    public ApiResponse searchByName(String universityName) {
        return null;
    }

    @Override
    public ApiResponse getAll() {
        return new ApiResponse("universities", universitiesUtils.getUniversities());
    }

    @Override
    public ApiResponse updateName(Long id, String newName) {
        return null;
    }

    @Override
    public ApiResponse update(Long id, UniversityDto university) {
        return null;
    }

}