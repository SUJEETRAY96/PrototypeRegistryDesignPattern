package org.example;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<String,Student>();

    public void SetStudent(String name,Student st){
        map.put(name,st);
    }

    public Student getStudent(String name){
        return map.get(name);
    }


}
