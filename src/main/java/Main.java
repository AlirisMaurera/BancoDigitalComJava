public class Main {
    public static void main(String[] args) {
        Cliente aliris = new Cliente();
        aliris.setNome("Aliris Maurera");

        Conta cc = new ContaCorrente(aliris);
        Conta poupanca = new ContaPoupanca(aliris);

        cc.depositar(100);
        cc.transferir(300, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cliente sebastian = new Cliente();
        sebastian.setNome("Sebastian Maurera");

        Conta cc2 = new ContaCorrente(sebastian);
        Conta poupanca2 = new ContaPoupanca(sebastian);

        cc2.depositar(1000);
        cc2.transferir(200, poupanca2);

        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();


    }


}
