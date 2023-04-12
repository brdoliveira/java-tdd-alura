package br.com.alura.tdd.service.calculadora;

import br.com.alura.tdd.service.calculadora.CalculadoraService;

public class CalculadoraServiceTestes {
    public static void main(String[] args) {
        CalculadoraService calc = new CalculadoraService();

        int soma = calc.somar(3,7);
        System.out.println(soma);

        soma = calc.somar(3,0);
        System.out.println(soma);

        soma = calc.somar(0,0);
        System.out.println(soma);

        soma = calc.somar(3,-1);
        System.out.println(soma);
    }
}
