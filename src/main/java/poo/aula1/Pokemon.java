package poo.aula1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {
    private String nome;
    private Integer nivel;

    public void quemEEssePokemon(){
        System.out.println("E o " + this.nome + " nivel " + this.nivel);
    }
}
