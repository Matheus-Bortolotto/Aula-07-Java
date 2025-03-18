package org.example;

import java.time.LocalDate;

public class LocadoraMain {
    public static void main(String[] args) {
        // Criando um veículo
        Veiculo veiculo = new Veiculo("ABC-1234", "Fusca", "Volkswagen", 1985, 50.0);

        // Criando um cliente
        Cliente cliente = new Cliente("123.456.789-00", "João da Silva", "99999-9999", "123456789");

        // Criando uma locação
        Locacao locacao = new Locacao(cliente, veiculo, LocalDate.of(2025, 3, 20), LocalDate.of(2025, 3, 25));

        // Exibindo os detalhes da locação
        System.out.println(locacao);
    }
}
