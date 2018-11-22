package ru.itpark;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    @org.junit.jupiter.api.Test
    void calcDeposit()
    {
        CalculatorService service = new CalculatorService();
        int sum = (int) service.calcDeposit(0,0,0);
        //System.out.println("depositAmount 0, 0 month, rate 0%, to issue: " +sum);
        assertEquals(0, sum);
    }{
        CalculatorService service = new CalculatorService();
        int sum = (int) service.calcDeposit(100_000,12,0.5);
        //System.out.println("depositAmount 100_000, 12 month, rate 0.5%, to issue: " +sum);
        assertEquals(100500, sum);
    }{
        CalculatorService service = new CalculatorService();
        int sum = (int) service.calcDeposit(100_000,12,1);
        //System.out.println("depositAmount 100_000, 12 month, rate 1%, to issue: " +sum);
        assertEquals(101000, sum);
    }{
        CalculatorService service = new CalculatorService();
        int sum = (int) service.calcDeposit(100_000,1,10);
        //System.out.println("depositAmount 100_000, 1 month, rate 10%, to issue: " +sum);
        assertEquals(100833, sum);

    }{
        CalculatorService service = new CalculatorService();
        int sum = (int) service.calcDeposit(-100_000, 1, 10);
        //System.out.println("depositAmount - 100_000, 1 month, rate 10%, to issue: " +sum);
        assertEquals(0, sum);
    }{
        CalculatorService service = new CalculatorService();
        int sum = (int) service.calcDeposit(1, 12, 10);
        //System.out.println("depositAmount 1, 1 month, rate 10%, to issue: " +sum);
        //assertEquals(0, sum);
        double a = Math.pow(10,3);
        System.out.println(a);
    }


}