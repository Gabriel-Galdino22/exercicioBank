package br.com.fiap.banco;

public class Conta extends Object {

    private String numero;
    private double saldo;
    private String titularidade = "Galdino";

    public Conta(String numero) {
        this.numero = numero;
    }

    public void depositar(double valor) {
        if (valor < 0)
            throw new IllegalArgumentException("Voce nao pode depositar valor negativo");
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo < valor)
            throw new IllegalArgumentException("Você não possui saldo suficiente para sacar o seu saldo e de: " + saldo);
        saldo -= valor;
    }

    public void transferencia(double valor) {
        if (saldo < valor || valor < 0)
            throw new IllegalArgumentException("Você não possui o saldo necessario para realizar essa transferência");
        saldo -= valor;
    }

    public void titularidade(String titularidade) {
        if (!titularidade.equals("Galdino"))
            throw new IllegalArgumentException("Voce so pode realizar essa transferencia para uma conta de mesma titularidade");
    }

    public void sacarPoupanca(double valor) {
        if (valor != 0)
            throw new IllegalArgumentException("Voce nao pode sacar na conta poupanaa");
        saldo -= valor;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitularidade() {
        return titularidade;
    }
}