package com.example.universitymanagement.utils;

import com.example.universitymanagement.models.University;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UniversitiesUtils {

    private static UniversitiesUtils universitiesUtils;

    private List<University> universities;

    private UniversitiesUtils() {
        universities = new ArrayList<>();
    }

    public static UniversitiesUtils getInstance() {
        if (universitiesUtils == null) {
            universitiesUtils = new UniversitiesUtils();
        }
        return universitiesUtils;
    }

    public Boolean addUniversity(University university) {
        return this.universities.add(university);
    }

    public Long generateId() {
        int size = universities.size();
        if (size == 0) {
            return 1L;
        }
        return universities.get(size - 1).getId() + 1;
    }

    public University deleteById(Long id) {
        University university = universities.stream()
                .filter(c -> c.getId().equals(id))
                .findAny()
                .orElse(null);
        if (university == null) {
            return null;
        }
        if (universities.remove(university)) {
            return university;
        }
        return null;
    }

    public List<University> getUniversities() {
        return universities;
    }

}
