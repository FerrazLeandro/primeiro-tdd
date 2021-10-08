package br.com.tech4me.primeirotdd.model;

public class Calculadora {

    public Double somar(Double primeiroValor, Double segundoValor) {
        return primeiroValor + segundoValor;
    }

    public Double subtrair(Double primeiroValor, Double segundoValor) {
        return primeiroValor - segundoValor;
    }

    public Double multiplicar(Double primeiroValor, Double segundoValor) {
        return primeiroValor * segundoValor;
    }

    public Double dividir(Double primeiroValor, Double segundoValor) {
        if (segundoValor == 0) {
            throw new ArithmeticException("Não é possível dividir por zero"); 
        } else {
            return Math.ceil(primeiroValor / segundoValor * 100) / 100d;
        }
    }
    
}
