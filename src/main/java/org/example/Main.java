package org.example;

public class Main {  public static void main(String[] args) {
    CalcService service = new CalcService();
    System.out.println(service.calculate(10,3,20));
    System.out.println(service.calculate(100,60,150));


}
}
