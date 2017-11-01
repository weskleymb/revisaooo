package exemplos;

public abstract class Conta {

    private int agencia;
    private int conta;
    private Pessoa titular;
    private double saldo;

    public Conta() {
    }

    public Conta(Pessoa titular, int agencia, int conta, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
    
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new RuntimeException("Valor maior que saldo disponível");
        } else if (valor < 0) {
            throw new RuntimeException("Valor não pode ser menor que ZERO");
        } 
        else {
            this.saldo -= valor;
        }
    }
    
    public void depositar(double valor) {
        if (valor < 0) {
            throw new RuntimeException("Valor não pode ser menor que ZERO");
        } else {
            this.saldo += valor;
        }
    }
    
    public void transferir(double valor, Conta conta) {
        this.sacar(valor);
        conta.depositar(valor);
    }

    @Override
    public String toString() {
        return "Conta{" 
                + "agencia=" + agencia 
                + ", conta=" + conta 
                + ", titular=" + titular 
                + ", saldo=" + saldo 
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        Conta c1 = this;
        Conta c2 = (Conta) obj;
        return (c1.conta == c2.conta && c1.agencia == c2.agencia);
    }

}
