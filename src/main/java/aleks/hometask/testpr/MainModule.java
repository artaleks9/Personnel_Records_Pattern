package aleks.hometask.testpr;

import com.google.inject.AbstractModule;

public class MainModule extends AbstractModule {

    protected void configure(){
        bind(CreatorEmployee.class).to(EmployeeFixedSalaryCreator.class);
        bind(CreatorEmployee.class).annotatedWith(EmployeeHourly.class).to(EmployeeHourlyWagesCreator.class);
    }
}
