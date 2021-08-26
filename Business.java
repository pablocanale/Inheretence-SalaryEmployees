import java.util.ArrayList;

public class Business {
    private String name;
    private ArrayList<Employee> employees;

    public void showTotalSalary(Employee employee){
        System.out.println("This week this employee must receive : $" + employee.totalSalary);
    }
}
