package br.com.bancooo.principal;

import br.com.bancooo.dominio.ContaCorrente;

public class BancoOO {

    public static void main(String[] args) {

        ContaCorrente contaA = new ContaCorrente();
        ContaCorrente contaB = new ContaCorrente();

        contaA.depositar(100.0);
        contaB.depositar(200.0);
        System.out.println("ContaA: " + contaA.getSaldo());
        System.out.println("ContaB: " + contaB.getSaldo());
        System.out.println("----------------------");

        contaA.transferir(contaB, 50.0);

        System.out.println("ContaA: " + contaA.getSaldo());
        System.out.println("ContaB: " + contaB.getSaldo());
        System.out.println("----------------------");

    }

}
