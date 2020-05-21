package poo.exercicioException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        int numeroAleatorio;
        for(int i = 0; i < 10; i++){
            numeroAleatorio = random.nextInt(1000);
            lista.add(numeroAleatorio);
        }
        boolean flag = true;
        System.out.println("Digite o indice desejado da lista: ");
        try{
            int indice = scanner.nextInt();
            System.out.println("Valor do indice: " + lista.get(indice));
        }
        catch (IndexOutOfBoundsException e1){
            System.out.println("Indice nao encontrado. Erro " + e1);
        }
        catch (InputMismatchException e2){
            System.out.println("Indice nao encontrado. Erro " + e2);
        }
        catch (Exception e){
            System.out.println("Indice nao encontrado. Erro " + e.getMessage());
        }
    }
}
