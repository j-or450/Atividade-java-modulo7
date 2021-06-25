package banco;

public class ContaSalario extends Conta {
    private int limiteDeSaque;

    public ContaSalario(int numero, int agencia, double saldo, int limiteDeSaque) {
        super(numero, agencia, saldo);
        this.limiteDeSaque = limiteDeSaque;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero() +
                "     Agencia: " + getAgencia();
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean sacar(double valor) {
        if (valor > this.getSaldo()) {
            System.out.println("Saldo insuficiente para saque.\nConfira seu saldo.");
            return false;
        }
        else {
            if(this.limiteDeSaque > 0) {
                this.limiteDeSaque--;
                this.setSaldo(this.saldo - valor);
                System.out.printf("Saque de: %.2f reais\nrealizado com sucesso.\n", valor);
                return true;
            }
            else {
                System.out.println("Limite mensal de saque\nexcedido.");
                return false;
            }
        }
    }

    public void depositar() {
        System.out.println("Conta não aceita deposito.");
    }
}

