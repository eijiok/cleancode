package chapter03.exemplo3_4.ruim;

import chapter03.exemplo3_4.InvalidEmployeeType;
import chapter03.exemplo3_4.Money;

import java.util.Date;

public class Payroll {

    public Money calculatePay(Employee e)
            throws InvalidEmployeeType {
        switch (e.type) {
            case COMMISSIONED:
                return calculateCommissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                throw new InvalidEmployeeType(e.type);
        }
    }
    public boolean isPayday(Employee e, Date date){
        return false;
    }

    public void deliverPay(Employee e, Money pay){

    }

    private Money calculateSalariedPay(Employee e) {
        return null;
    }

    private Money calculateHourlyPay(Employee e) {
        return null;
    }

    private Money calculateCommissionedPay(Employee e) {
        return null;
    }
}
