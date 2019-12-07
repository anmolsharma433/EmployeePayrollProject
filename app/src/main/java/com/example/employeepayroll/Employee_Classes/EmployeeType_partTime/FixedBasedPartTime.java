package com.example.employeepayroll.Employee_Classes.EmployeeType_partTime;

public final class FixedBasedPartTime extends PartTime {

    // create variables for stroing values
    int fixedAmount;


    // getter and setter
    public int getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(int fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    // constructor to input all values


    public FixedBasedPartTime(int employeeID, String employeeName, int employeeAge, float rate, int hoursWorked, int fixedAmount) {
        super(employeeID, employeeName, employeeAge, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    //override abstract function to calculate salary
    @Override
    public float calcEarnings() {

        float salary = this.getRate() * this.getHoursWorked();
        float totalSalary = fixedAmount+salary;
        return totalSalary;
    }




}
