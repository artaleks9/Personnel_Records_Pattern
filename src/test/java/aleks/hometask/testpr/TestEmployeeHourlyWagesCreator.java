package aleks.hometask.testpr;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Created by Alex on 02.04.14.
 */
public class TestEmployeeHourlyWagesCreator {

    EmployeeHourlyWagesCreator hourlyCreator = new EmployeeHourlyWagesCreator();

    @Test
    public void testEmployeeNumberIsNullOfEmpHourly()throws InvalidArgumentException{
        String employeeNumber = null;
        String surname = "Name";
        String dateOfBirth = "dateOfBirth";
        double hourlyRate = 10;
        try{
            hourlyCreator.createEmployee(employeeNumber,
                    surname, dateOfBirth, hourlyRate);
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
        double hourlyRate = 10;
        try{
            hourlyCreator.createEmployee( employeeNumber,
                    surname,dateOfBirth,hourlyRate);
            Assert.fail("The input argument is \n" +
                    "    public void testHourlyRateOutBounds(){invalid.\nShould have thrown a InvalidArgumentException");
        }catch (InvalidArgumentException iae){
            Assert.assertEquals("The input argument is invalid.",iae.getMessage());
        }
    }

    @Test
    public void testHourlyRateOutBounds(){
        String employeeNumber = "number";
        String surname = "Name";
        String dateOfBirth = "dateOfBirth";
        double hourlyRate = 200;
        try{
            hourlyCreator.createEmployee(employeeNumber,
                    surname, dateOfBirth, hourlyRate);
            Assert.fail("The input argument is invalid.\nShould have thrown a InvalidArgumentException");
        }catch (InvalidArgumentException iae){
            Assert.assertEquals("The input argument is invalid.",iae.getMessage());
        }
    }

    @Test
    public void testCreateEmpHourly() throws InvalidArgumentException {
        String employeeNumber = "num";
        String surname = "Name";
        String dateOfBirth = "dateOfBirth";
        double hourlyRate = 10;
        EmployeeHourlyWages empActual = new EmployeeHourlyWages();
        Employee empExpected = hourlyCreator.createEmployee(employeeNumber,
                surname, dateOfBirth, hourlyRate);
        Assert.assertSame(empExpected.getClass(), empActual.getClass());
    }
}
