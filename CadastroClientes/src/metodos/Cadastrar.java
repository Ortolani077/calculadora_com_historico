package metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import connection.DatabaseConnection;

public class Cadastrar {

    public List<String> obterClientesEAparelhos() {
        List<String> clientesEAparelhos = new ArrayList<>();

        String sql = "SELECT c.id as cliente_id, c.nome, c.cpf, c.celular, a.id as aparelho_id, a.tipoaparelho, a.marca, a.modelo, a.defeito FROM clientes c LEFT JOIN aparelho a ON c.id = a.cliente_id";

        try (Connection connection = DatabaseConnection.obterConexao();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                long clienteId = resultSet.getLong("cliente_id");
                String nome = resultSet.getString("nome");
                String cpf = resultSet.getString("cpf");
                String celular = resultSet.getString("celular");

                long aparelhoId = resultSet.getLong("aparelho_id");
                String tipoAparelho = resultSet.getString("tipoaparelho");
                String marca = resultSet.getString("marca");
                String modelo = resultSet.getString("modelo");
                String defeito = resultSet.getString("defeito");

                String cadastro = String.format(
                        "ID Cliente: %d\nNome: %s\nCPF: %s\nCelular: %s\n\nID Aparelho: %d\nTipo Aparelho: %s\nMarca: %s\nModelo: %s\nDefeito: %s",
                        clienteId, nome, cpf, celular, aparelhoId, tipoAparelho, marca, modelo, defeito);

                clientesEAparelhos.add(cadastro);
            }

        } catch (SQLException e) {
            exibirErro("Erro ao obter cadastros do banco de dados.", e);
        }

        return clientesEAparelhos;
    }

    public long cadastrarCliente(String nome, String cpf, String celular) {
        String sql = "INSERT INTO clientes (nome, cpf, celular) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.obterConexao();
                PreparedStatement preparedStatement = connection.prepareStatement(sql,
                        PreparedStatement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, cpf);
            preparedStatement.setString(3, celular);

            int linhasAfetadas = preparedStatement.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getLong(1);
                }
            }

            System.out.println("Cliente cadastrado com sucesso.");

        } catch (SQLException e) {
            exibirErro("Erro ao cadastrar cliente no banco de dados.", e);
        }

        return -1;
    }

    public void cadastrarAparelho(String tipoaparelho, String marca, String modelo, String defeito, long idCliente) {
        String sql = "INSERT INTO aparelho (tipoaparelho, marca, modelo, defeito, cliente_id) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.obterConexao();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, tipoaparelho);
            preparedStatement.setString(2, marca);
            preparedStatement.setString(3, modelo);
            preparedStatement.setString(4, defeito);
            preparedStatement.setLong(5, idCliente);

            preparedStatement.executeUpdate();
        

        } catch (SQLException e) {
            exibirErro("Erro ao cadastrar Aparelho no banco de dados.", e);
        }
    }

    public void editarCadastro(long idCliente, String novoNome, String novoCpf, String novoCelular,
            String novoTipoAparelho, String novaMarca, String novoModelo, String novoDefeito) {
        // SQL para atualizar os dados do cliente
        String sqlCliente = "UPDATE clientes SET nome=?, cpf=?, celular=? WHERE id=?";

        // SQL para atualizar os dados do aparelho
        String sqlAparelho = "UPDATE aparelho SET tipoaparelho=?, marca=?, modelo=?, defeito=? WHERE cliente_id=?";

        try (Connection connection = DatabaseConnection.obterConexao();
                PreparedStatement preparedStatementCliente = connection.prepareStatement(sqlCliente);
                PreparedStatement preparedStatementAparelho = connection.prepareStatement(sqlAparelho)) {

            // Atualiza os dados do cliente
            preparedStatementCliente.setString(1, novoNome);
            preparedStatementCliente.setString(2, novoCpf);
            preparedStatementCliente.setString(3, novoCelular);
            preparedStatementCliente.setLong(4, idCliente);

            preparedStatementCliente.executeUpdate();

            // Atualiza os dados do aparelho vinculado ao cliente
            preparedStatementAparelho.setString(1, novoTipoAparelho);
            preparedStatementAparelho.setString(2, novaMarca);
            preparedStatementAparelho.setString(3, novoModelo);
            preparedStatementAparelho.setString(4, novoDefeito);
            preparedStatementAparelho.setLong(5, idCliente);

            preparedStatementAparelho.executeUpdate();

            

        } catch (SQLException e) {
            exibirErro("Erro ao editar cadastro no banco de dados.", e);
        }
    }

    private void exibirErro(String mensagem, SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
