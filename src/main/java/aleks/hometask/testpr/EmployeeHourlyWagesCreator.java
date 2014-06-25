package aleks.hometask.testpr;

public class EmployeeHourlyWagesCreator implements CreatorEmployee {

    /**
     * Creates, initializes, and returns a new object the EmployeeHourlyWages
     *
     * @param employeeNumber the EmployeeHourlyWages's ID.  This may be any non-null String
     * @param surname the EmployeeHourlyWages's last name.  This may be any non-null String
     * @param dateOfBirth the EmployeeHourlyWages's date of birth.  This may be any non-null String
     * @param hourlyRate the EmployeeHourlyWages's hourly rate.This may be any double in the range 5.0 to 100.0
     * @return a reference to the new EmployeeHourlyWages object
     * @throws InvalidArgumentException if any of the input parameters is invalid
     */

    public Employee createEmployee(String employeeNumber,
                                   String surname,
                                   String dateOfBirth,
                                   double hourlyRate)throws InvalidArgumentException {

        EmployeeHourlyWages empHourly = new EmployeeHourlyWages();

        if ((employeeNumber != null)&&(!employeeNumber.equals("")))
            empHourly.setEmployeeNumber(employeeNumber);
        else
            throw new InvalidArgumentException();

        if ((surname != null)&&(!surname.equals("")))
            empHourly.setSurname(surname);
        else
            throw new InvalidArgumentException();

        if ((dateOfBirth != null)&&(!dateOfBirth.equals("")))
            empHourly.setDateOfBirth(dateOfBirth);
        else
            throw new InvalidArgumentException();

        if (hourlyRate >=5.0 && hourlyRate <=100.0)
            empHourly.setHourlyRate(hourlyRate);
        else
            throw new InvalidArgumentException();

        empHourly.getAvrSalary();

        return empHourly;
    }

}
