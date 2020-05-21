package poo.desafio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.InputMismatchException;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {
    private int ra;
    private String nome;
    private float notaP1;
    private float notaP2;

    public static void cadastroDeAluno(Aluno aluno){
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do {
            try {
                System.out.println("Digite o nome do aluno: ");
                aluno.setNome(scanner.next());

                System.out.println("Digite o RA do aluno: ");
                aluno.setRa(scanner.nextInt());

                System.out.println("Digite a nota da P1: ");
                aluno.setNotaP1(scanner.nextFloat());

                System.out.println("Digite a nota da P2: ");
                aluno.setNotaP2(scanner.nextFloat());
                flag = true;
            }catch (InputMismatchException e){
                System.out.println("Valor invalido. Erro " + e + ". Digite os dados novamente.");
                scanner.nextLine();
                flag = false;
            }
        }while (!flag);
    }

    public void verificaSeAprovado(){
        System.out.println("Aluno: " + this.nome);
        System.out.println("RA: " + this.ra);
        System.out.println("Nota P1: " + this.notaP1);
        System.out.println("Nota P2: " + this.notaP2);

        float media = (this.notaP1 + this.notaP2) / 2;

        System.out.printf("Media aritmetica: %.2f\n", media);
        if(media >= 5)
            System.out.println("Media maior ou igual a 5. Aluno aprovado!");
        else
            System.out.println("Media menor que 5. Aluno reprovado!");
    }
}
