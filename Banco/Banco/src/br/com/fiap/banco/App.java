package br.com.fiap.banco;

public class App {

    public static void main(String[] args) {

        try {
            Conta conta = new Conta("00123-5");
            conta.depositar(200);
            conta.sacar(30);
            conta.transferencia(10);
            conta.titularidade("Rafael");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            ContaPoupanca poupanca = new ContaPoupanca("00321-5");
            poupanca.depositar(200);
            poupanca.getNumero();
            poupanca.sacarPoupanca(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

}
