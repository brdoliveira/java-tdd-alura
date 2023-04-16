package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        BonusService service = new BonusService();
        assertThrows(
        IllegalArgumentException.class,
        () -> service.calcularBonus(
            new Funcionario(
                    "Bruno",
                    LocalDate.now(),
                    new BigDecimal("100000")
            )
        ));

    }

    @Test
    void bonusDeveriaSer10PorCentoDoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(
            new Funcionario(
                 "Bryan",
                    LocalDate.now(),
                    new BigDecimal("2500")
            )
        );

        assertEquals(new BigDecimal("250.00"),bonus);
    }

    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(
                new Funcionario(
                        "Rod",
                        LocalDate.now(),
                        new BigDecimal("10000")
                )
        );

        assertEquals(new BigDecimal("1000.00"),bonus);
    }
}
