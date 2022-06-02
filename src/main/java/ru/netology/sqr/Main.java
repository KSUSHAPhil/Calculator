package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int bottom = 10;
        int top = 99;

        int result = service.crazyCalc(bottom, top);
        System.out.println(result);
    }
}
