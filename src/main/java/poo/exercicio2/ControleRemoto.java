package poo.exercicio2;

public class ControleRemoto {
    public ControleRemoto() { }

    public void aumentarVolume(Televisao tv) { tv.setVolume(tv.getVolume()+1); }

    public void diminuirVolume(Televisao tv){
        tv.setVolume(tv.getVolume()-1);
    }

    public void aumentarCanal(Televisao tv) {
        tv.setCanal(tv.getCanal()+1);
    }

    public void diminuirCanal(Televisao tv) {
        tv.setCanal(tv.getCanal()-1);
    }

    public void trocarCanal(Televisao tv, Integer canalIndicado){
        tv.setCanal(canalIndicado);
    }

    public void consultaVolumeECanal(Televisao tv){
        System.out.println("Volume: " + tv.getVolume() + " Canal: " + tv.getCanal());
    }
}
