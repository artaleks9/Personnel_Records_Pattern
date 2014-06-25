package aleks.hometask.testpr;

public class EmployeeFixedSalary implements Employee{

    private String employeeNumber;
    private String surname;
    private String dateOfBirth;
    private double fixedPayment;

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getFixedPayment() {
        return fixedPayment;
    }

    public void setFixedPayment(double fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    public double getAvrSalary(){
        return fixedPayment;
    }

    public String toString(){
        return "\nEmployee with fixed salary\n"+getEmployeeNumber()
         +"\n"+getSurname()+"\n"+getDateOfBirth()+"\n"+getFixedPayment()
         +"\n"+getAvrSalary()+"\n";
    }
}
