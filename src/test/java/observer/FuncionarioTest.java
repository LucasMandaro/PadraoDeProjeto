package observer;

import org.example.Observer.Funcionario;
import org.example.Observer.Horarios;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    void deveNotificarFuncionarioTurnoManha(){
        Horarios horarioManha = new Horarios("Manha","MensagemTestManha","06h as 14h");
        Horarios horarioTarde = new Horarios("Tarde","MensagemTestTarde","14h as 22h");

        Funcionario funcionario1 = new Funcionario("FuncionarioTest1");
        Funcionario funcionario2 = new Funcionario("FuncionarioTest2");

        funcionario1.matricularHorario(horarioManha);
        funcionario2.matricularHorario(horarioTarde);

        horarioManha.informar();

        assertEquals("FuncionarioTest1, Aviso a todos do horario da Turno{ Manha, horario=06h as 14h, mensagem=MensagemTestManha }",
                funcionario1.getUltimaNotificacao());
        assertEquals(null, funcionario2.getUltimaNotificacao());
    }
}
