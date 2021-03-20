package br.com.bancooo.dominio;

public class ContaPoupanca extends Conta {

    private Double rentabilidadeMensal;

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    public void resgatar(Conta conta, Double valor) {

    }

}
