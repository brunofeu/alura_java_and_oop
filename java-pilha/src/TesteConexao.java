public class TesteConexao {
    public static void main(String[] args) {
        try (Conexao conexao = new Conexao()){ // esta forma de Try torna o finally desnecessário
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Erro na conexão");
        }
    }
}
