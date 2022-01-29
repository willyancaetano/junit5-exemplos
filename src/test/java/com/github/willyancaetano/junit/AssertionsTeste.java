/*
    MIT License

    Copyright (c) 2022 Willyan Guimarães Caetano

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
 */

package com.github.willyancaetano.junit;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Exemplos de asserções usando a classe {@link org.junit.jupiter.api.Assertions}
 *
 *
 */
public class AssertionsTeste {

    @Test
    void validarValoresDeOperacoes() {

        /* Validando soma */
        int resultado = 10;
        assertEquals(resultado, (5 + 5));

        /* Validando igualdade de valores */
        double valor = 5.0;
        double outroValor = 5.0;
        assertEquals(valor, outroValor);
    }

    @Test
    void validarSeArraysSaoIguais() {

        /* Valida se os arrays são iguais, comparando um a um */
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};
        assertArrayEquals(primeiroLancamento, segundoLancamento);

        /* Utilizando arrays de diferentes tipos, começando por boolean[] */
        boolean[] flags = {true, false, false};
        assertArrayEquals(new boolean[]{true, false, false}, flags);

        /* Utilizando arrays de diferentes tipos, começando por double[] */
        double[] valores = {5.0, 10.5, 50D, 46d};
        assertArrayEquals(new double[]{5.0, 10.5, 50D, 46d}, valores);
    }

    @Test
    void validarSeObjetoEstaNuloOuNao() {

        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {

        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }

    @Test
    void validarQueValoresSaoDiferentes(){

        int x = 5;
        int y = 6;

        assertNotEquals(5, 6);
    }

    @Test
    void validarQueAlgumaCondicaoEhFalsa() {

        boolean condicao = 5 + 6 == 12;

        assertFalse(condicao);
    }

    @Test
    void validarQueAlgumaCondicaoEhVerdadeira() {

        var condicao = 6 + 6 == 12;

        assertTrue(condicao);
    }
}
