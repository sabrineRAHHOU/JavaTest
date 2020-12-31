package Controleur;

import Service.MathOperation;

public class Calculator {
  public static void main(String[] args){
    MathOperation math1 = new MathOperation();
     int sum1 = math1.sum(5,5);
     int divide = math1.divide(10,5);
    int multip =  math1.multiplication(3,4);
     int soub = math1.soubstraction(10,5);
     System.out.println(sum1);
     System.out.println(divide);
      System.out.println(multip);
      System.out.println(soub);
  }
}
