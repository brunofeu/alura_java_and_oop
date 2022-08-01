public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(300);
        try{
            conta.saca(200);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(conta.saldo);
        try{
            conta.saca(200);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(conta.saldo);
    }
}
