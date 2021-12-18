package edu.uni.curso;

import edu.uni.alu.Aluno;
import edu.uni.bib.Bibliografia;
import edu.uni.bib.Livro;
import edu.uni.prof.Professor;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DisciplinaTest {

    @Test
    void addProfessor() {
        Professor prof1 = mock(Professor.class);
        when(prof1.getNome()).thenReturn("Germano");
    }

    @Test
    void addAluno() {

        Aluno al1 = new Aluno("Matheus", 3);

        Disciplina disciplina = new Disciplina("Geografia");


        assertTrue(disciplina.addAluno(al1));
        assertFalse(disciplina.addAluno(al1));
    }
}