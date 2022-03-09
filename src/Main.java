public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Naomi");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Cristina");
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente2);

        cc.depositar(100);

        cc.transferir(poupanca, 100);

        cc.imprimirExtrato();

        poupanca.imprimirExtrato();


    }
}
