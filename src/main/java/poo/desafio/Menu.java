package poo.desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void chamaMenu(){
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        int op = 1;
        do{
            System.out.println("########## Calculo de Medias ###########");
            System.out.println("[1] - Cadastrar aluno;");
            System.out.println("[2] - Verificar se o aluno foi aprovado;");
            System.out.println("[0] - Sair.");
            System.out.println("#################### MENU ####################");
            System.out.println("Digite a opcao: ");
            try{
                op = scanner.nextInt();
                switch (op) {
                    case 1:
                        aluno.cadastroDeAluno(aluno);
                        break;
                    case 2:
                        aluno.verificaSeAprovado();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opcao invalida. Digite novamente.");
                        break;
                }
            }catch(InputMismatchException e){
                System.out.println("Opcao invalida. Erro " + e + ". Digite a opcao novamente.");
                scanner.nextLine();
            }
        }while (op != 0);
    }
}
