package org.example;

public class Student {
    private int id;
    private String name;
    private String batch;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Student(){

    }
    public Student(Student other){
        this.name = other.name;
        this.id = other.id;
        this.batch = other.batch;
    }
    public Student copy(){
        return new Student(this);
    }
}
