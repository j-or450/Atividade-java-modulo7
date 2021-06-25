package banco;

public abstract class Conta {
    private int numero;
    private int agencia;
    protected double saldo;

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public abstract double getSaldo();

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public Conta(int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }
}




