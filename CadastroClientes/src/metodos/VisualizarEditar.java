package metodos;

import java.awt.Toolkit;
import java.util.List;

import javax.swing.JOptionPane;

public class VisualizarEditar {

    private final Cadastrar cadastrar;

    public VisualizarEditar() {
        this.cadastrar = new Cadastrar();
    }

    public void exibirCadastros() {
        try {
            List<String> clientesEAparelhos = cadastrar.obterClientesEAparelhos();

            StringBuilder mensagem = new StringBuilder("Cadastros existentes:\n\n");

            for (String cadastro : clientesEAparelhos) {
                mensagem.append(cadastro).append("\n\n");
            }

            if (clientesEAparelhos.isEmpty()) {
                mensagem.append("Nenhum cadastro encontrado.");
            }

            JOptionPane.showMessageDialog(null, mensagem.toString(), "Exibir Cadastros",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            exibirErro("Erro ao exibir cadastros.", e);
        }
    }

    public void editarCadastro() {
        try {
            String idClienteStr = JOptionPane.showInputDialog(null, "Digite o ID do cliente para editar: ");
            long idCliente = Long.parseLong(idClienteStr);

            String novoNome = JOptionPane.showInputDialog(null, "Digite o novo nome do cliente: ");
            String novoCpf = JOptionPane.showInputDialog(null, "Digite o novo CPF do cliente: ");
            String novoCelular = JOptionPane.showInputDialog(null, "Digite o novo celular do cliente: ");

            String novoTipoAparelho = JOptionPane.showInputDialog(null, "Digite o novo tipo de aparelho: ");
            String novaMarca = JOptionPane.showInputDialog(null, "Digite a nova marca do aparelho: ");
            String novoModelo = JOptionPane.showInputDialog(null, "Digite o novo modelo do aparelho: ");
            String novoDefeito = JOptionPane.showInputDialog(null, "Digite o novo defeito do aparelho: ");

            // Chama o método editarCadastro da classe Cadastrar
            cadastrar.editarCadastro(idCliente, novoNome, novoCpf, novoCelular, novoTipoAparelho, novaMarca, novoModelo, novoDefeito);

            JOptionPane.showMessageDialog(null, "Cadastro editado com sucesso.",
                    "Cadastro De Produtos e Clientes", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            exibirErro("Erro ao converter ID do cliente.", e);
        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Um dos dados está incorreto.",
                    "Cadastro De Produtos e Clientes", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void exibirErro(String mensagem, Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        new VisualizarEditar().editarCadastro();
    }
}
