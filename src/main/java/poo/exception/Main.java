package poo.exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.println("Digite um numero: ");
        num1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        num2 = scanner.nextInt();

        try{
            resultado = num1 / num2;
            System.out.println(resultado);
        }
        catch(Exception e){
            System.out.println("Erro " + e.getMessage());
        }
    }
}
