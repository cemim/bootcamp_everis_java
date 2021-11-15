package com.teste;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;


public class ExceptionTest {
    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){
        List<String> lista = new ArrayList<String>();

        lista.get(0);
    }

    @Test
    public void textExceptionMessage(){
        try {
            new ArrayList<Object>().get(0);
            fail("Esperado que IndexOutOfBoundsException seja lançada");
        } catch (IndexOutOfBoundsException ex) {
            assertThat(ex.getMessage(), is("Index 0 out of bounds for length 0"));
        }
    }

}
