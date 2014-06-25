package aleks.hometask.testpr;

import java.io.Serializable;

public interface Employee extends Serializable{

    public double getAvrSalary();
    public String toString();
    public String getEmployeeNumber();
    public String getSurname();
    public String getDateOfBirth();
}
