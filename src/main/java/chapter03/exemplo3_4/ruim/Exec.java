package chapter03.exemplo3_4.ruim;

import chapter03.exemplo3_4.EmployeeType;
import chapter03.exemplo3_4.InvalidEmployeeType;
import chapter03.exemplo3_4.Money;

public class Exec {
    public static void main(String[] args) throws InvalidEmployeeType {

        Money money = new Payroll().calculatePay(new Employee(EmployeeType.SALARIED));
        Money money2 = new Payroll().calculatePay(new Employee(EmployeeType.COMMISSIONED));
        Money money3 = new Payroll().calculatePay(new Employee(EmployeeType.HOURLY));

    }

}
