package shanker.assignment.data;

import java.util.Scanner;

interface A{
    public void inputA();
    public void outputA();

}
interface B{
    public void inputB();
    public void outputB();
}
interface C{
    public void inputC();
    public void outputC();
}

interface D extends A,B,C{

    public void methodD();
}

class E implements D{

    @Override
    public void inputA() {
        System.out.println("Input Method of A");
    }

    @Override
    public void outputA() {
        System.out.println("OutPut Method of A");
    }

    @Override
    public void inputB() {
        System.out.println("Input Method of B");
    }

    @Override
    public void outputB() {
        System.out.println("Output of B");
    }

    @Override
    public void inputC() {
        System.out.println("Input of C");
    }

    @Override
    public void outputC() {
        System.out.println("output of C");
    }

    @Override
    public void methodD() {
        System.out.println("Method of D");
    }
}

public class Question3 {

    public static void mehtod1(A ref){
        ref.inputA();
        ref.outputA();
    }
    public static void mehtod2(B ref){
        ref.inputB();
        ref.outputB();
    }
    public static void mehtod3(C ref){
        ref.inputC();
        ref.outputC();
    }
    public static void mehtod4(D ref){
        ref.methodD();
    }

    public static void main(String args[]){
        E obj = new E();
        Question3.mehtod1(obj);
        Question3.mehtod2(obj);
        Question3.mehtod3(obj);
        Question3.mehtod4(obj);






    }

}
