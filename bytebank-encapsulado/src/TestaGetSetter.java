public class TestaGetSetter {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 25555);

        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Vieira");
        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());
    }
}
