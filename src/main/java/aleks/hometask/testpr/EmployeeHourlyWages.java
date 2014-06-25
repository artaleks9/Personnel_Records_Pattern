package aleks.hometask.testpr;

public class EmployeeHourlyWages implements Employee{

    private String employeeNumber;
    private String surname;
    private String dateOfBirth;
    private double hourlyRate;

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

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getAvrSalary(){
        return 20.8*8*hourlyRate;
    }

    public String toString(){
        return "\nEmployee with hourly wages\n"+getEmployeeNumber()
                +"\n"+getSurname()+"\n"+getDateOfBirth()+"\n"+getHourlyRate()
                +"\n"+getAvrSalary()+"\n";
    }
}
