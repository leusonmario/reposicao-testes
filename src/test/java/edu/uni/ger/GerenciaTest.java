package edu.uni.ger;

import edu.uni.alu.Aluno;
import edu.uni.curso.Disciplina;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GerenciaTest {


    @Test
    public void addDisciplinaMock1() {
        Gerencia gerencia = Mockito.mock(Gerencia.class);
    }

    @Test
    public void addDisciplinaMock2() {
        Disciplina disciplina = new Disciplina("Geografia");
        Gerencia gerencia = Mockito.mock(Gerencia.class);
        Mockito.when(gerencia.addDisciplina(disciplina)).thenReturn(true);
        Assert.assertTrue(gerencia.addDisciplina(disciplina));

    }

    @Test
    public void addDisciplinaMock3() {

        Gerencia gerencia = Mockito.mock(Gerencia.class);
        Disciplina disciplina = new Disciplina("Geografia");
        Disciplina disciplina2 = new Disciplina("Filosofia");

        Mockito.when(gerencia.addDisciplina(disciplina)).thenReturn(true);
        Assert.assertTrue(gerencia.addDisciplina(disciplina));
        Mockito.verify(gerencia).addDisciplina(disciplina);

    }

    @Test
    public void addDiciplinaMock4(){
        Gerencia gerenciaa = Mockito.mock(Gerencia.class);
        Aluno aluno = new Aluno("Pedro","8");
        Disciplina disciplina = new Disciplina("Geografia");

        Mockito.when(gerenciaa.addDisciplina(disciplina)).thenReturn(false);
        Assert.assertFalse(gerenciaa.addDisciplina(disciplina));
        Mockito.verify(gerenciaa).addDisciplina(disciplina);

    }

    @Test
    public void addDisciplina1() {
        Gerencia gerencia = new Gerencia();
        Disciplina disciplina1 = new Disciplina("Geografia");

        Assert.assertFalse(gerencia.addDisciplina(disciplina1));
    }

    @Test
    public void addDisciplina2() {
        Gerencia gerencia = new Gerencia();
        Disciplina disciplina1 = new Disciplina("Geografia");
        Disciplina disciplina2 = new Disciplina("Geografia");


        Assert.assertEquals(gerencia.addDisciplina(disciplina1), gerencia.addDisciplina(disciplina2));
    }

    @Test
    public void addDisciplina3() {
        Gerencia gerencia = new Gerencia();
        Disciplina disciplina1 = new Disciplina("Geografia");
        Disciplina disciplina2 = new Disciplina("Matematica");

        Assert.assertNotSame(disciplina1, disciplina2);

    }

}