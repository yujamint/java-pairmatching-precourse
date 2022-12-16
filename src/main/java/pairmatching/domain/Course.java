package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private final String name;

    Course(String name) {
        this.name = name;
    }

    public static List<String> names() {
        List<String> courseNames = new ArrayList<>();

        for (Course course : values()) {
            courseNames.add(course.name);
        }

        return courseNames;
    }
}