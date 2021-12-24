package edu.uni.bib;

import edu.uni.bib.Bibliografia;
import edu.uni.bib.Livro;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BibliografiaTest {

    @Test
    public void addBibliografiaTest1(){

        Bibliografia bibliografia = new Bibliografia();
        Livro livro1 = new Livro();

        livro1.setTitulo("livro1");
        livro1.setIsbn("1A");
        livro1.setNumeroExemplares(3);


        Assert.assertTrue(bibliografia.addLivro(livro1));


    }

    @Test
    public void addBibliografiaTest2(){

        Bibliografia bibliografia = new Bibliografia();
        Livro livro1 = new Livro();

        livro1.setTitulo("livro1");
        livro1.setIsbn("1A");
        livro1.setNumeroExemplares(3);

        Livro livro2 = new Livro();


        Assert.assertFalse(bibliografia.addLivro(livro2));

    }

    @Test
    public void addBibliografiaTest3(){

        Livro livro1 = new Livro();

        livro1.setTitulo("livro1");
        livro1.setIsbn("1A");
        livro1.setNumeroExemplares(3);

        //teste pra saber se o nome é igual
        Assert.assertEquals("livro1", livro1.getTitulo());



    }

    @Test
    public void addBibliografiaTest4(){

        Livro livro1 = new Livro();

        livro1.setTitulo("livro1");
        livro1.setIsbn("1A");
        livro1.setNumeroExemplares(3);


        Assert.assertEquals(livro1, livro1);


    }

    @Test
    public void addBibliografiaTest5(){

        Livro livro1 = new Livro();

        livro1.setTitulo("livro1");
        livro1.setIsbn("1A");
        livro1.setNumeroExemplares(3);

        Livro livro2 = new Livro();

        livro2.setTitulo("livro2");
        livro2.setIsbn("1B");
        livro2.setNumeroExemplares(3);

        Assert.assertNotSame(livro1, livro2);




    }


}
