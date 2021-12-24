package edu.uni.curso;

import org.junit.After;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotaTest {

    @BeforeEach
    public void addNota1() {
        Nota nota1 = new Nota();
        nota1.addNota(10.0);

        Nota nota2 = new Nota();
        nota2.addNota(10.0);

        Assert.assertEquals(nota1.getNotas(), nota2.getNotas());
    }

    @AfterEach
    public void addNota2() {
        Nota nota1 = new Nota();
        nota1.addNota(10.0);

        Nota nota2 = new Nota();
        nota2.addNota(9.0);

        Assert.assertNotSame(nota1.getNotas(), nota2.getNotas());
    }


    @Test
    public void addNotaTest1() {
        Nota nota1 = new Nota();
        nota1.addNota(10.0);

        Nota nota2 = new Nota();
        nota2.addNota(10.0);

        Assert.assertEquals(nota1.getNotas(), nota2.getNotas());
    }

    @Test
    public void addNotaTest2() {
        Nota nota1 = new Nota();
        nota1.addNota(10.0);

        Nota nota2 = new Nota();
        nota2.addNota(9.0);

        Assert.assertNotSame(nota1.getNotas(), nota2.getNotas());
    }


}