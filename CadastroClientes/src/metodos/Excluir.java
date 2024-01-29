package metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import connection.DatabaseConnection;

public class Excluir {

    public void excluirCadastro(long idCliente) {
        try {
            // SQL para excluir os aparelhos vinculados ao cliente
            String sqlAparelho = "DELETE FROM aparelho WHERE cliente_id = ?";

            try (Connection connection = DatabaseConnection.obterConexao();
                    PreparedStatement preparedStatementAparelho = connection.prepareStatement(sqlAparelho)) {

                // Define o ID do cliente para exclusão
                preparedStatementAparelho.setLong(1, idCliente);

                // Exclui os aparelhos vinculados ao cliente
                int linhasAfetadasAparelho = preparedStatementAparelho.executeUpdate();

                // Verifica se pelo menos uma linha foi afetada na exclusão dos aparelhos
                if (linhasAfetadasAparelho > 0) {
                    // Agora você pode excluir o cliente
                    excluirCliente(idCliente);
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao excluir cadastro, verifique o ID e tente novaente.",
                            "Cadastro De Produtos e Clientes", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (SQLException e) {
            exibirErro("Erro ao excluir cadastro no banco de dados.", e);
        }
    }

    private void excluirCliente(long idCliente) {
        try {
            // SQL para excluir o cliente
            String sqlCliente = "DELETE FROM clientes WHERE id = ?";

            try (Connection connection = DatabaseConnection.obterConexao();
                    PreparedStatement preparedStatementCliente = connection.prepareStatement(sqlCliente)) {

                // Define o ID do cliente para exclusão
                preparedStatementCliente.setLong(1, idCliente);

                // Exclui o cliente
                int linhasAfetadasCliente = preparedStatementCliente.executeUpdate();

                // Verifica se pelo menos uma linha foi afetada na exclusão do cliente
                if (linhasAfetadasCliente > 0) {
                    JOptionPane.showMessageDialog(null, "Cadastro excluído com sucesso.",
                            "Cadastro De Produtos e Clientes", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao excluir cadastro.",
                            "Cadastro De Produtos e Clientes", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (SQLException e) {
            exibirErro("Erro ao excluir cadastro no banco de dados.", e);
        }
    }

    private void exibirErro(String mensagem, Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
