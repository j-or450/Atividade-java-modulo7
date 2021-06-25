package banco;

import java.util.Calendar;

public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, double saldo, int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero() +
                "     Agencia: " + getAgencia();
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public double getSaldo() {
        Calendar diaAtual = Calendar.getInstance();
        if(diaAtual.get(Calendar.DAY_OF_MONTH) >= this.diaAniversario) {
            return this.saldo + this.saldo * taxaDeJuros;
        }
        else {
            return this.saldo;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.printf("Deposito: %.2f reais\nrealizado com sucesso.\n",valor);
    }

    public boolean sacar(double valor) {
        if(valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque.\nConfira seu saldo.");
            return false;
        } else {
            this.setSaldo(this.saldo - valor) ;
            System.out.printf("Saque de: %.2f reais\nrealizado com sucesso.\n",valor);
            return true;
        }
    }
}

