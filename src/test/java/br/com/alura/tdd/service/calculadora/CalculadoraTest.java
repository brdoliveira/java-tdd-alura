package br.com.alura.tdd.service.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        CalculadoraService calc = new CalculadoraService();
        int soma = calc.somar(3,7);

        Assertions.assertEquals(10, soma);
    }
}
