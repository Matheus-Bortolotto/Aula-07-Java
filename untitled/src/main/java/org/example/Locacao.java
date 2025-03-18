package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valorTotal;

    // Construtor
    public Locacao(Cliente cliente, Veiculo veiculo, LocalDate dataInicio, LocalDate dataFim) {
        if (cliente == null || veiculo == null || dataInicio == null || dataFim == null) {
            throw new IllegalArgumentException("Todos os campos devem ser preenchidos.");
        }
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        calcularValorTotal();
    }

    // Método para calcular o valor total
    public void calcularValorTotal() {
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);
        if (dias <= 0) {
            throw new IllegalArgumentException("A data de fim deve ser posterior à data de início.");
        }
        this.valorTotal = dias * veiculo.getValorDiaria();
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Locacao [cliente=" + cliente + ", veiculo=" + veiculo + ", valorTotal=" + valorTotal + "]";
    }
}
