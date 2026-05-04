import java.util.Observable;

public class SistemaDeEventos extends Observable {

    private String nomeJogo;
    private String nomeEvento;

    public SistemaDeEventos(String nomeJogo, String nomeEvento) {
        this.nomeJogo = nomeJogo;
        this.nomeEvento = nomeEvento;
    }

    public void desbloquearConquista() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "SistemaDeEventos{" +
                "nomeJogo='" + nomeJogo + '\'' +
                ", nomeEvento='" + nomeEvento + '\'' +
                '}';
    }
}