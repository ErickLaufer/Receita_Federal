package aplication;

import java.util.ArrayList;
import java.util.List;

public class TesteImposto {
    public static void main(String[] args) {
        List<Contribuinte> contribuintes = new ArrayList<>();

        // Adicionar pessoas físicas e jurídicas à lista
        contribuintes.add(new PessoaFisica("João", 1800.0, "123.456.789-01"));
        contribuintes.add(new PessoaJuridica("Empresa A", 100000.0, "12.345.678/0001-23"));
        // Adicionar mais contribuintes aqui...

        // Calcular e mostrar os impostos
        for (Contribuinte contribuinte : contribuintes) {
            double imposto = contribuinte.calcularImposto();
            System.out.println(contribuinte.toString() + " - Imposto a pagar: R$ " + imposto);
        }
    }
}