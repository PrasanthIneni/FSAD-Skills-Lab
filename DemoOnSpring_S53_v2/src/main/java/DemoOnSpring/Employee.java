package DemoOnSpring;

import java.util.List;

public class Employee {

    private int empId;
    private String empName;
    private double empSalary;
    private boolean empActive;
    private List<String> empList;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public boolean isEmpActive() {
        return empActive;
    }

    public void setEmpActive(boolean empActive) {
        this.empActive = empActive;
    }

    public List<String> getEmpList() {
        return empList;
    }

    public void setEmpList(List<String> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "empId=" + empId +
               "\nempName=" + empName +
               "\nempSalary=" + empSalary +
               "\nempActive=" + empActive +
               "\nempList=" + empList;
    }
}
