public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(50);
        System.out.println(conta.saldo);

        boolean conseguiuRetirar = conta.saca(30);
        System.out.println(conta.saldo);
        System.out.println(conseguiuRetirar);

        conseguiuRetirar = conta.saca(30);
        System.out.println(conta.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaTransfere = new Conta();
        contaTransfere.deposita(1000);
        contaTransfere.transfere(300, conta);
        System.out.println(contaTransfere.saldo);
    }
}
