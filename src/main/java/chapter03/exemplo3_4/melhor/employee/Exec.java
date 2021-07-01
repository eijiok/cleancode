package chapter03.exemplo3_4.melhor.employee;

import chapter03.exemplo3_4.EmployeeType;
import chapter03.exemplo3_4.InvalidEmployeeType;

public class Exec {
    public static void main(String[] args) throws InvalidEmployeeType {

        EmployeeFactoryImpl factory = new EmployeeFactoryImpl();
        for (EmployeeRecord record : getEmployees()) {
            Employee employee = factory.makeEmployee(record);
            employee.calculatePay();
        }
    }

    private static EmployeeRecord[] getEmployees() {
        EmployeeRecord[] employees = new EmployeeRecord[] {
                new EmployeeRecord(EmployeeType.SALARIED),
                new EmployeeRecord(EmployeeType.HOURLY),
                new EmployeeRecord(EmployeeType.COMMISSIONED)
        };
        return employees;
    }

}
