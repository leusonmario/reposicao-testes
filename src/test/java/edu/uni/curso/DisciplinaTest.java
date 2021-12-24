package edu.uni.curso;

import edu.uni.alu.Aluno;
import edu.uni.prof.Professor;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {

    @BeforeEach
    public void addProfessorBefore() {

        Professor p1 = new Professor("Matheus", "1234");
        Disciplina disciplina = new Disciplina("Geografia");

        disciplina.addProfessor(p1);

    }

    @AfterEach
    public void addProfessorAfter() {

        Professor p1 = new Professor("Matheus", "1234");
        Disciplina disciplina = new Disciplina("Geografia");

        Assert.assertTrue(disciplina.addProfessor(p1));
    }


    @Test
    void addProfessor1() {
        Professor p1 = new Professor("Matheus", "1234");
        Disciplina disciplina = new Disciplina("Geografia");
        disciplina.addProfessor(p1);

        Assert.assertEquals("1234", disciplina.getProfessor().getTelefone());


    }

    @Test
    void addProfessor2() {
        Professor p1 = new Professor("Matheus", "1234");
        Disciplina disciplina = new Disciplina("Geografia");
        disciplina.addProfessor(p1);

        Professor p2 = new Professor("Leuson", "1235");
        disciplina.addProfessor(p2);

        Assert.assertNotSame(p1, p2);


    }
}