package desafios.dio;

import java.util.Scanner;

public class Calculadora {
    /*public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor");
        b = scan.nextInt();


    }*/

    public static void somar(double a, double b){
        double resultado = a+b;
        System.out.println("A soma de " + a + " + " + b + " = " + resultado);
    }

    public static void subtrair(double a, double b){
        double resultado = a-b;
        System.out.println("A subtração de " + a + " + " + b + " = " + resultado);
    }

    public static void multiplicar(double a, double b){
        double resultado = a*b;
        System.out.println("A multiplicação de " + a + " + " + b + " = " + resultado);
    }
    public static void dividir(double a, double b){
        double resultado = a/b;
        System.out.println("A divisão de " + a + " / " + b + " = " + resultado);
    }
}
