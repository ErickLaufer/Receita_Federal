package aplication;

import java.util.ArrayList;
import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
    public static void main(String[] args) {
        ArrayList<Contribuinte> contribuintes = new ArrayList<>();

        contribuintes.add(new PessoaFisica("João", 2500, "123.456.789-01"));
        contribuintes.add(new PessoaFisica("Maria", 4000, "987.654.321-00"));
        contribuintes.add(new PessoaFisica("Carlos", 1500, "456.789.012-34"));
        contribuintes.add(new PessoaJuridica("Empresa A", 20000, "12.345.678/0001-99"));
        contribuintes.add(new PessoaJuridica("Empresa B", 100000, "98.765.432/0001-00"));
        contribuintes.add(new PessoaJuridica("Empresa C", 5000, "45.678.901/0001-23"));

        for (Contribuinte c : contribuintes) {
            System.out.println(c);
            System.out.println("Imposto a ser pago: " + c.calcularImposto());
            System.out.println();
        }
    }
}