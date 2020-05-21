package poo.aula2;

public class Main {
    public static void main(String[] args) {
        Pessoa gerente = new Gerente("Jorge");
        Pessoa secretario = new Secretario("Roberto");

        System.out.println(gerente.getNome());
        System.out.println(secretario.getNome());
    }
}
