package org.example;

public class IntelligentStudent extends Student{
    private int iq;

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                '}';
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent(String name,int id, String batch,int iq){
        super.setName(name);
        super.setId(id);
        super.setBatch("June");
        this.iq = iq;
    }
    public IntelligentStudent(IntelligentStudent istudent){
        super(istudent);
        this.iq=istudent.iq;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }
}
