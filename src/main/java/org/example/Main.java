package org.example;


public class Main {
    public static void main(String[] args) {
        Student st = new Student();//Student object
        st.setName("Sujeet");
        st.setId(1);
        st.setBatch("may2022");

        StudentRegistry sr = new StudentRegistry();//Only one object of Student Registry is needed
        sr.SetStudent("may2022", st);
        Student copyStudent  = sr.getStudent("may2022").copy();
        copyStudent.setBatch("May");//update the copied object

        System.out.println(st);
        System.out.println(copyStudent);

        Student iStudent = new IntelligentStudent("ramesh",15,"April",150);
        sr.SetStudent("April", iStudent);
        Student copyiStudent = sr.getStudent("April").copy();

        System.out.println(iStudent);
        System.out.println(copyiStudent);
    }
}