package student;

import java.time.LocalDate;

public class Student {
    private long student_id;
    private String surname;
    private String name;
    private String father_name;
    private LocalDate date_of_birth;
    private String address;
    private long telephone_number;
    private int course;
    private String group;

    public Student(long student_id, String surname, String name, String father_name, LocalDate date_of_birth, String address, long telephone_number, int course, String group) {
        this.student_id = student_id;
        this.surname = surname;
        this.name = name;
        this.father_name = father_name;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.telephone_number = telephone_number;
        this.course = course;
        this.group = group;
    }
    /************************************************************/
    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone_number(long telephone_number) {
        this.telephone_number = telephone_number;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    /*************************************************************/
    public long getStudent_id() {
        return student_id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getFather_name() {
        return father_name;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public long getTelephone_number() {
        return telephone_number;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }
    /**********************************************************/

}










