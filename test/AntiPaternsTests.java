import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;

public class AntiPaternsTests {

    @AfterAll
    static void tearDown(){
        End e = new End();
    }

    // Happy path
    // pq apenas verifica que a idade é maior que 0, não tendo limite máximo de idade
    @Test
    void testaIdade(){
        Pessoa pessoa = new Pessoa("Albernaz", "Viseu", 2000);
        assert pessoa.getIdade() > 0;
    }

    // Free ride,
    // pq apenas é suposto verificar se o campo Escola não é nulo e aproveita e verifica a cidade
    @Test
    void testaCidadeSeNulo(){
        Estudante estudante = new Estudante("Albertino", "Viseu", 20, "estgv", 002);
        assert estudante.getCidade() != null;
        
        assert estudante.getEscola() != null;
    }

    // The Stranger
    // o teste se Estudante é nulo não deveria estar neste teste pois na verdade não pertence a este, deveria ser feito
    // outro teste para o testar
    @Test
    void testaProfessorSeDiferenteDeNulo(){
        Professor professor = new Professor("Manuel Portugal", "Aveiro", 43, "estgv", 010);
        assert professor != null;

        Estudante estudante = new Estudante("Albertino", "Viseu", 20, "estgv", 002);
        assert estudante != null;
    }


    // LoudMouth
    // enche a consola de mensagens, sendo desnecessário
    @Test
    void testaProfessor(){
        Date date = new Date();
        Professor professor = new Professor("Manuel Portugal", "Aveiro", 43, "estgv", 010);
        assert professor.getNome() != null && professor.getEscola() != null &&
                professor.getCidade() != null && professor.getIdade() > 0;
        System.out.println(date.toString());
        System.out.println("A testar Professor...");
        System.out.println("Verificar a nome: " +professor.getNome());
        System.out.println("Verificar a idade: " +professor.getIdade());
        System.out.println("Verificar a escola: " +professor.getEscola());
        System.out.println("Verificar o ID: " +professor.getId_professor());
    }
}
