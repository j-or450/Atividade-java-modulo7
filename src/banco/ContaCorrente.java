package banco;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, double saldo, double chequeEspecial) {
        super(numero, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero() +
                "     Agencia: " + getAgencia();
    }

    public double getSaldo() {
        return this.chequeEspecial + this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito: " + valor + " reais\nrealizado com sucesso.");
    }

    public boolean sacar(double valor) {
        if(valor > this.getSaldo()) {
            System.out.println("Saldo insuficiente para saque.\nConfira seu saldo.");
            return false;
        } else {
            this.saldo -= valor;
            System.out.println("Saque de: " +valor+ " reais\nrealizado com sucesso.");
            return true;
        }
    }
}

