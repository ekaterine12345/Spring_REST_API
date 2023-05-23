package com.example.universitymanagement.models;

import com.example.universitymanagement.dtos.UniversityDto;
import com.example.universitymanagement.utils.UniversitiesUtils;
import lombok.*;

@NoArgsConstructor
@Data
public class University {

    private Long id;
    private String name;
    private String address;

    public University(UniversityDto universityDto) {
        this.name = universityDto.getName();
        this.address = universityDto.getAddress();
        // ...
        this.id = UniversitiesUtils.getInstance().generateId();
    }

}