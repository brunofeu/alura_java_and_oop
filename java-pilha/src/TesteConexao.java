public class TesteConexao {
    public static void main(String[] args) {
        Conexao con = new Conexao();
        try {
            con.leDados();
            con.fecha();
        } catch (IllegalStateException ex) {
            System.out.println("Erro na conexão");
        } finally {
            con.fecha();
        }
    }
}
