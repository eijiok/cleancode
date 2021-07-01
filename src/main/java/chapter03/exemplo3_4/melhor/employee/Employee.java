package chapter03.exemplo3_4.melhor.employee;

import chapter03.exemplo3_4.EmployeeType;
import chapter03.exemplo3_4.Money;

public abstract class Employee {
    public EmployeeType type;

    public abstract boolean isPayday();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);
}
