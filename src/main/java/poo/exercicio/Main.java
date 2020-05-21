package poo.exercicio;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1997, 11, 12);
        Pessoa pessoa = new Pessoa("Joao", 1.7, dataNascimento);

        pessoa.imprimirDados();
        pessoa.calculaIdade();
    }
}
