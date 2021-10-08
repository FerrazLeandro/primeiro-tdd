package br.com.tech4me.primeirotdd.model;


import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculadoraTest {

    @InjectMocks
    private Calculadora calculadora;

    @Test
    public void deve_retornar_2_ao_somar_1_mais_1(){
        // AAA

        // Arrange        
        Double primeiroValor = 1.0;
        Double segundoValor = 1.0;
        Double valorEsperado = 2.0;


        // ACT
        Double valorObtido = calculadora.somar(primeiroValor, segundoValor);


        // Assert
        Assertions.assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void deve_retornar_2_ao_subtrair_4_menos_2(){
        // AAA

        // Arrange        
        Double primeiroValor = 4.0;
        Double segundoValor = 2.0;
        Double valorEsperado = 2.0;


        // ACT
        Double valorObtido = calculadora.subtrair(primeiroValor, segundoValor);


        // Assert
        Assertions.assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void deve_retornar_4_ao_multiplicar_2_por_2(){
        // AAA

        // Arrange        
        Double primeiroValor = 2.0;
        Double segundoValor = 2.0;
        Double valorEsperado = 4.0;


        // ACT
        Double valorObtido = calculadora.multiplicar(primeiroValor, segundoValor);


        // Assert
        Assertions.assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void deve_retornar_3_34_ao_dividir_10_por_3(){
        // AAA

        // Arrange        
        Double primeiroValor = 10.0;
        Double segundoValor = 3.0;
        Double valorEsperado = 3.34;


        // ACT
        Double valorObtido = calculadora.dividir(primeiroValor, segundoValor);


        // Assert
        Assertions.assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void deve_retornar_erro_ao_dividir_por_0(){
        // AAA

        // Arrange        
        Double primeiroValor = 10.0;
        Double segundoValor = 0.0;
        String valorEsperado = "Não é possível dividir por zero";


        // ACT
        try {
            Double valorObtido = calculadora.dividir(primeiroValor, segundoValor);
            fail("Passou a apresentar erradamente o valor " + valorObtido);  
        } catch (ArithmeticException e) {
            Assertions.assertEquals(valorEsperado, e.getMessage()); 
        }

    }
    
}
