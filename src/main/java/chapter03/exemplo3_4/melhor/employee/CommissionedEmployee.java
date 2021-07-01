package chapter03.exemplo3_4.melhor.employee;


import chapter03.exemplo3_4.Money;

public class CommissionedEmployee extends Employee {
    public CommissionedEmployee(EmployeeRecord r) {
        super();
    }

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliverPay(Money pay) {

    }
}
