package com.Interpreter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese una operacion (ejemplo: uno mas uno): \n");
        String str= sc.nextLine();
        String [] operacion = str.split(" ");
        Interpreter.interpretar(operacion);
    }
}
