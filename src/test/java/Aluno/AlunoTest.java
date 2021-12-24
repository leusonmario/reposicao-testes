package Aluno;

import edu.uni.alu.Aluno;
import edu.uni.bib.Bibliografia;
import edu.uni.bib.Livro;
import edu.uni.curso.Disciplina;
import edu.uni.prof.Professor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AlunoTest {

    @Test
    void addAluno1() {
        Aluno al1 = new Aluno("Pedro", "1");
        Disciplina disciplina = new Disciplina("Geografia");


        Assert.assertTrue(disciplina.addAluno(al1));

    }

    @Test
    void addAluno2() {

        Disciplina disciplina = new Disciplina("Geografia");
        Aluno al1 = new Aluno("Francisco", "1");


        disciplina.addAluno(al1);

        Assert.assertEquals(al1, al1);

    }

    @Test
    void addAluno3() {

        Disciplina disciplina = new Disciplina("Geografia");
        Aluno al1 = new Aluno("Francisco", "1");
        Aluno al2 = new Aluno("Francisco", "1");


        disciplina.addAluno(al1);
        disciplina.addAluno(al2);

        Assert.assertNotSame(al1, al2);

    }
}
