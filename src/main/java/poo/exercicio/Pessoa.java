package poo.exercicio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.omg.CORBA.INTERNAL;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    private String nome;
    private Double altura;
    private LocalDate dataNascimento;

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome + "\nAltura: " + this.altura + "m");
    }

    public void calculaIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(dataNascimento, dataAtual);
        System.out.println("Idade: " + idade.getDays() + " dias " + idade.getMonths() + " meses " + idade.getYears() + " anos." );
    }

}
