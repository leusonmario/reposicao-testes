package edu.uni.bib;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BibliografiaTest {


    @Test
    public void addLivro1() {

        Livro livro1 = mock(Livro.class);
        when(livro1.getIsbn()).thenReturn("1A");

    }


    @Test
    public void addLivro2() {
        Livro livro1 = new Livro();
        livro1.setTitulo("Livro1");
        livro1.setIsbn("2b");
        livro1.setNumeroExemplares(3);


        Livro livro2 = new Livro();
        livro1.setTitulo("Livro2");
        livro1.setIsbn("3c");
        livro1.setNumeroExemplares(3);


        Bibliografia bibliografia = new Bibliografia();
        bibliografia.addLivro(livro1);

        assertTrue(bibliografia.addLivro(livro1));
        assertFalse(bibliografia.addLivro(livro2));






    }
}