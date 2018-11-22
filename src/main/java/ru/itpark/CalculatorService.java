package ru.itpark;

public class CalculatorService {
    public double calcDeposit (int depositAmount,//сумма депозита
                               int termOfPlacement,//срок размещения
                               double interestRate){//процентная ставка

        double accrualForYear; //начисление за год
        double accrualForMonth; //начисление за мес
        double sum;
        int year = 12;
        accrualForYear = depositAmount/100*interestRate; //начисление за год
        accrualForMonth = accrualForYear/year; //начисление за месяц

        sum = accrualForMonth * termOfPlacement + depositAmount;
        if (sum < 0) sum = 0;
        return sum;

    }

}
