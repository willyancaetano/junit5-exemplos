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

package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Classe de Teste apresentando os conceitos de @Test, @DisplayName, @Disabled e asserções
 */
public class PessoaTest {

    @Test
    void deveRetonarSeEhMaiorDeIdade() {
        Pessoa joao = new Pessoa("Joãozinho", LocalDateTime.of(2020, 1, 1, 15, 00));
        Assertions.assertFalse(joao.ehMaiorDeIdade());

        Pessoa marta = new Pessoa("Marta", LocalDateTime.of(1995, 1, 1, 15, 00));
        Assertions.assertTrue(marta.ehMaiorDeIdade());

        List<Pessoa> pessoas = List.of(new Pessoa("Julia", LocalDateTime.now()), new Pessoa("Maria", LocalDateTime.now()));

        Assertions.assertAll("pessoas",
                () -> Assertions.assertFalse(pessoas.get(0).ehMaiorDeIdade()),
                () -> Assertions.assertFalse(pessoas.get(1).ehMaiorDeIdade())
        );
    }

    @Test
    @Disabled("Teste ainda não implementado")
    void deveRetornarIdade() {

    }
}
