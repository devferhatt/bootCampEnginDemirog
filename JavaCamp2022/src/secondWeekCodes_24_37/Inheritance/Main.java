package Inheritance;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();

        employeeManager employeeManager = new employeeManager();
        customerManager customerManager = new customerManager();
        employeeManager.BestEmployee();
        employeeManager.Add();
        customerManager.Add();
    }
}