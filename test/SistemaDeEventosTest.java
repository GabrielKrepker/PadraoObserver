import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaDeEventosTest {

    @Test
    void deveNotificarJogador() {
        SistemaDeEventos sistema = new SistemaDeEventos("God of War", "Derrotou o Boss Final");
        Jogador jogador = new Jogador("Gabriel");

        jogador.registrar(sistema);
        sistema.desbloquearConquista();

        assertEquals(
                "Gabriel, nova conquista desbloqueada em SistemaDeEventos{nomeJogo='God of War', nomeEvento='Derrotou o Boss Final'}",
                jogador.getUltimaNotificacao()
        );
    }
}