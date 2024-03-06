package com.bridgelabz.employeepayrollapp.entity;
import jakarta.persistence.*;

@Entity
@Table(name ="employee")
public class EmployeePayroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int empId;
    @Column(name="employee_name")
    private  String name;
    @Column(name="employee_salary")
    private long salary;

    @Column(name="start_Date")
    private  String date;

    @Column(name="Gender")
    private  String gender;

    @Column(name="profilePicture")
    private String  profilePicture;

    @Column(name="notes")
    private String notes;



    public EmployeePayroll()
    {
EmployeePayroll employee;
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
