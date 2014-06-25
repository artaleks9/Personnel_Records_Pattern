package aleks.hometask.testpr;

public interface CreatorEmployee {

    public  Employee createEmployee(String employeeNumber,
                                          String surname,
                                          String dateOfBirth,
                                          double rate) throws InvalidArgumentException;
}
