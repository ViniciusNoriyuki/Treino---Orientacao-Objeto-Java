package poo.aula1;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("Charmander", 10);
//        pokemon.nivel = 10;
//        pokemon.setNivel(10);
//        pokemon.nome = "Pikachu";
//        pokemon.setNome("Pikachu");

//        System.out.println(pokemon.nivel);
//        System.out.println(pokemon.nome);
        System.out.println(pokemon.getNivel());
        System.out.println(pokemon.getNome());
        pokemon.quemEEssePokemon();
    }
}
