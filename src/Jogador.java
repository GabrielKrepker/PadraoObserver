import java.util.Observable;
import java.util.Observer;

public class Jogador implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void registrar(SistemaDeEventos sistema) {
        sistema.addObserver(this);
    }

    @Override
    public void update(Observable sistema, Object arg1) {
        this.ultimaNotificacao = this.nome + ", nova conquista desbloqueada em " + sistema.toString();
    }
}