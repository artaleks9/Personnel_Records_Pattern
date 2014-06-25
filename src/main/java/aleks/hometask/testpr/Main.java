package aleks.hometask.testpr;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 *
 * Created by Alex on 02.04.14.
 */
public class Main {

    private final CreatorEmployee employeeFixed;
    private final CreatorEmployee employeeHourly;

    @Inject
    public Main(CreatorEmployee employeeFixed,@EmployeeHourly CreatorEmployee employeeHourly){
        this.employeeFixed = employeeFixed;
        this.employeeHourly = employeeHourly;
    }

    public static void main(String[] args) throws InvalidArgumentException {
        Injector injector = Guice.createInjector(new MainModule());
        Main main = injector.getInstance(Main.class);
        System.out.println(main.employeeFixed.createEmployee("C541","Svetlov","1990/03/05",2650));
        System.out.println(main.employeeHourly.createEmployee("F018","Pupkin","1996/02/29",5.0));

    }
}
