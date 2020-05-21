package poo.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Televisao televisao = new Televisao();
        ControleRemoto controleRemoto = new ControleRemoto();

        controleRemoto.aumentarVolume(televisao);
        controleRemoto.aumentarVolume(televisao);
        controleRemoto.aumentarVolume(televisao);
        controleRemoto.diminuirVolume(televisao);
        controleRemoto.trocarCanal(televisao, 10);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.diminuirCanal(televisao);
        controleRemoto.consultaVolumeECanal(televisao);
    }
}
