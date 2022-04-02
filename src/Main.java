public class Main {
    public static void main(String[] args) {
        Cliente marcos = new Cliente();
        marcos.setNome("Marcos");

        Conta cc = new ContaCorrente(marcos);
        Conta poupanca = new ContaPoupanca(marcos);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
