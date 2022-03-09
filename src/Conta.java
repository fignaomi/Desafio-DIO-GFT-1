public abstract class Conta implements IConta{

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
       this.agencia = Conta.AGENCIA_PADRAO;
       this.numero = SEQUENCIAL++;
       this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        if(saldo >= valor){
            saldo -= valor;
        }
//        else{
//
//        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void transferir(IConta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfoComuns() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
}
