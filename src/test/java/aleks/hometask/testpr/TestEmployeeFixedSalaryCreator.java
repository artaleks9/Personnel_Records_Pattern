package aleks.hometask.testpr;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Created by Alex on 22.03.14.
 */
public class TestEmployeeFixedSalaryCreator {

    EmployeeFixedSalaryCreator fixedCreator = new EmployeeFixedSalaryCreator();

    @Test
    public void testEmployeeNumberIsNullOfEmpFixed(){
        String employeeNumber = null;
        String surname = "Name";
        String dateOfBirth = "dateOfBirth";
        double fixedPayment = 1000;
        try{
            fixedCreator.createEmployee(employeeNumber,
                    surname, dateOfBirth, fixedPayment);
            Assert.fail("The input argument is invalid.\nShould have thrown a InvalidArgumentException");
        }catch (InvalidArgumentException iae){
            Assert.assertEquals("The input argument is invalid.",iae.getMessage());
        }
    }

    @Test
    public void testEmployeeNumberIsEmptyOfEmpHourly(){
        String employeeNumber = "";
        String surname = "Name";
        String dateOfBirth = "dateOfBirth";
        double fixedPayment = 1000;
        try{
            fixedCreator.createEmployee(employeeNumber,
                    surname, dateOfBirth, fixedPayment);
            Assert.fail("The input argument is invalid.\nShould have thrown a InvalidArgumentException");
        }catch (InvalidArgumentException iae){
            Assert.assertEquals("The input argument is invalid.",iae.getMessage());
        }
    }

    @Test
    public void testFixedPaymentOutBounds(){
        String employeeNumber = "number";
        String surname = "Name";
        String dateOfBirth = "dateOfBirth";
        double fixedPayment = 200;
        try{
            fixedCreator.createEmployee(employeeNumber,
                    surname, dateOfBirth, fixedPayment);
            Assert.fail("The input argument is invalid.\nShould have thrown a InvalidArgumentException");
        }catch (InvalidArgumentException iae){
            Assert.assertEquals("The input argument is invalid.",iae.getMessage());
        }
    }

    @Test
    public void testCreateEmpFixed() throws InvalidArgumentException {
        String employeeNumber = "num";
        String surname = "Name";
        String dateOfBirth = "dateOfBirth";
        double fixedPayment = 1000;
        EmployeeFixedSalary empActual = new EmployeeFixedSalary();
        Employee empExpected = fixedCreator.createEmployee(employeeNumber,
                surname, dateOfBirth, fixedPayment);
        Assert.assertSame(empExpected.getClass(), empActual.getClass());
    }
}




