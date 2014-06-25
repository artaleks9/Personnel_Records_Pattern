package aleks.hometask.testpr;

import java.util.*;

public class Company {

    private Company(){
    }

    private static class CompanyHelper {
        private static final Company INSTANCE = new Company();
    }

    public static Company getInstance(){
        return CompanyHelper.INSTANCE;
    }

    List <Employee> listEmployees = new ArrayList<>();

    public List <Employee> createEmployees()throws InvalidArgumentException {
        EmployeeFixedSalaryCreator fixedCreator = new EmployeeFixedSalaryCreator();
        EmployeeHourlyWagesCreator hourlyCreator = new EmployeeHourlyWagesCreator();

        listEmployees.add(fixedCreator.createEmployee("A319", "Antonov", "1967/10/04", 700));
        listEmployees.add(hourlyCreator.createEmployee("A023", "Ivanov", "1979/12/15", 25.0));
        listEmployees.add(hourlyCreator.createEmployee("B012", "Petrov", "1989/07/19", 7.5));
        listEmployees.add(hourlyCreator.createEmployee("F018", "Pupkin", "1996/02/29", 5.0));
        listEmployees.add(fixedCreator.createEmployee("A009", "Sidorov", "1985/08/08", 1500));
        listEmployees.add(fixedCreator.createEmployee("C541", "Svetlov", "1990/03/05", 2650));
        listEmployees.add(fixedCreator.createEmployee("M119", "Mironov", "1965/11/09", 5900));
        listEmployees.add(fixedCreator.createEmployee("P763", "Papanov", "1956/07/06", 8000));
        listEmployees.add(hourlyCreator.createEmployee("D106", "Davydov", "1987/07/19", 14.7));
        listEmployees.add(hourlyCreator.createEmployee("H524", "Mashkov", "1966/01/06", 100.0));
        listEmployees.add(fixedCreator.createEmployee("G009", "Shatrov", "1979/10/21", 3790));

        return listEmployees;
    }

    public List<Employee> getListEmployees(){
        return listEmployees;
    }

    public List<Employee> sortSalary() throws IllegalAccessException, InstantiationException {
        Collections.sort(listEmployees,SortSalary.class.newInstance());
        return listEmployees;
    }
    public List<Employee> sortSurname() throws IllegalAccessException, InstantiationException {
        Collections.sort(listEmployees,SortSurname.class.newInstance());
        return  listEmployees;
    }

    public List<Employee> sortId() throws IllegalAccessException, InstantiationException {
        Collections.sort(listEmployees,SortId.class.newInstance());
        return listEmployees;
    }

    public List<Employee> sortDate() throws IllegalAccessException, InstantiationException {
        Collections.sort(listEmployees,SortDate.class.newInstance());
        return listEmployees;
    }
}
