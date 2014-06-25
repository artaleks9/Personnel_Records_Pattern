package aleks.hometask.testpr;

public class EmployeeFixedSalaryCreator implements CreatorEmployee {

    /**
     * Creates, initializes, and returns a new object EmployeeFixedSalary
     *
     * @param employeeNumber the EmployeeFixedSalary's ID. This may be any non-null String
     * @param surname the EmployeeFixedSalary's last name. This may be any non-null String
     * @param dateOfBirth the EmployeeFixedSalary's date of birth. This may be any non-null String
     * @param fixedPayment the EmployeeFixedSalary's fixed payment. This may be any double in the range 500.0 to 10000.0
     * @return a reference to the new EmployeeFixedSalary object
     * @throws InvalidArgumentException if any of the input parameters is invalid
     */

    public Employee createEmployee(String employeeNumber,
                                   String surname,
                                   String dateOfBirth,
                                   double fixedPayment)throws InvalidArgumentException {

        EmployeeFixedSalary empFixed = new EmployeeFixedSalary() ;

        if ((employeeNumber != null)&&(!employeeNumber.equals("")))
            empFixed.setEmployeeNumber(employeeNumber);
        else
            throw new InvalidArgumentException();

        if ((surname != null)&&(!surname.equals("")))
            empFixed.setSurname(surname);
        else
            throw new InvalidArgumentException();

        if ((dateOfBirth != null)&&(!dateOfBirth.equals("")))
            empFixed.setDateOfBirth(dateOfBirth);
        else
            throw new InvalidArgumentException();

        if (fixedPayment >= 500 && fixedPayment <=10000)
            empFixed.setFixedPayment( fixedPayment);
        else
            throw new InvalidArgumentException();

        empFixed.getAvrSalary();

        return empFixed;
    }
}
