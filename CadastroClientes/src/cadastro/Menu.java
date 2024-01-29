package cadastro;

import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import metodos.Cadastrar;
import metodos.Excluir;

public class Menu {

    Locale localBR = new Locale("pt", "BR");
    Calendar agora = Calendar.getInstance();
    DateFormat formatoDeData = DateFormat.getDateInstance(DateFormat.FULL, localBR);
    Cadastrar novoCadastro = new Cadastrar(); // Instanciando a classe Cadastrar
    Excluir novoExcluir = new Excluir();

    public void exibirMenu() {
        int menu = 0;

        do {
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                        " Sistema De Cadastro De Clientes e serviços  \n\n" + formatoDeData.format(agora.getTime())
                                + "\n\nQual item deseja escolher? " + "\n\n1 - Cadastrar Clientes "
                                + "\n 2 - Exibir Cadastros " + "\n 3 - Editar cadastro " + "\n 4 - Excluir cadastro "
                                + "\n 5 - Sair"));

                switch (menu) {
                    case 1:
                        cadastrarCliente();
                        break;
                    case 2:
                        exibirCadastros();
                        break;
                    case 3:
                        editarCadastro(); // Chama o método para editar cadastro
                        break;
                    case 4:
                        excluirCadastro();
                        break;
                    case 5:
                        sairDoPrograma();
                        break;
                    default:
                        opcaoInvalida();
                        break;
                }
            } catch (NumberFormatException e) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.",
                        "Cadastro De Produtos e Clientes", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado.",
                        "Cadastro De Produtos e Clientes", JOptionPane.ERROR_MESSAGE);
            }

        } while (menu != 5);
        System.exit(0);
    }

    private void cadastrarCliente() {
        try {
            String nome = JOptionPane.showInputDialog(null, " Digite o Nome do Cliente: ");
            String cpf = JOptionPane.showInputDialog(null, " Digite o CPF do cliente ").toUpperCase();
            String celular = JOptionPane.showInputDialog(null, " Digite o celular do cliente: ");

            // Chama o método cadastrarCliente da classe Cadastrar
            long clienteId = novoCadastro.cadastrarCliente(nome, cpf, celular);

            // Verifica se o cadastro do cliente foi bem-sucedido
            if (clienteId != -1) {
                cadastrarAparelho(clienteId); // Chama o método para cadastrar aparelho
            } else {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar cliente.",
                        "Cadastro De Produtos e Clientes", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Um dos dados está incorreto.",
                    "Cadastro De Produtos e Clientes", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cadastrarAparelho(long clienteId) {
        try {
            String tipoAparelho = JOptionPane.showInputDialog(null, " Digite o tipo de aparelho do cliente: ");
            String marca = JOptionPane.showInputDialog(null, " Qual a marca do aparelho? ");
            String modelo = JOptionPane.showInputDialog(null, " Qual o modelo?  ");
            String defeito = JOptionPane.showInputDialog(null, " Qual defeito relatado? ");

            // Chama o método cadastrarAparelho da classe Cadastrar
            novoCadastro.cadastrarAparelho(tipoAparelho, marca, modelo, defeito, clienteId);

            JOptionPane.showMessageDialog(null, "Aparelho cadastrado com sucesso.",
                    "Cadastro De Produtos e Clientes", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Um dos dados está incorreto.",
                    "Cadastro De Produtos e Clientes", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void exibirCadastros() {
        try {
            List<String> clientesEAparelhos = novoCadastro.obterClientesEAparelhos();

            if (clientesEAparelhos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum cadastro encontrado.",
                        "Cadastro De Produtos e Clientes", JOptionPane.INFORMATION_MESSAGE);
            } else {
                StringBuilder cadastros = new StringBuilder("Cadastros:\n\n");
                for (String cadastro : clientesEAparelhos) {
                    cadastros.append(cadastro).append("\n\n----------------\n");
                }

                JTextArea textArea = new JTextArea(cadastros.toString());
                JScrollPane scrollPane = new JScrollPane(textArea);

                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                textArea.setEditable(false);

                scrollPane.setPreferredSize(new java.awt.Dimension(500, 300));

                JOptionPane.showMessageDialog(null, scrollPane,
                        "Cadastro De Produtos e Clientes", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Erro ao exibir cadastros.",
                    "Cadastro De Produtos e Clientes", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void editarCadastro() {
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
            novoCadastro.editarCadastro(idCliente, novoNome, novoCpf, novoCelular, novoTipoAparelho, novaMarca,
                    novoModelo, novoDefeito);

            JOptionPane.showMessageDialog(null, "Cadastro editado com sucesso.",
                    "Cadastro De Produtos e Clientes", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Um dos dados está incorreto.",
                    "Cadastro De Produtos e Clientes", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void excluirCadastro() {
        try {
            String idClienteStr = JOptionPane.showInputDialog(null, "Digite o ID do cliente para excluir: ");
            long idCliente = Long.parseLong(idClienteStr);

            // Chama o método excluirCadastro da classe Excluir
            novoExcluir.excluirCadastro(idCliente);

            JOptionPane.showMessageDialog(null, "Cadastro excluído com sucesso.",
                    "Cadastro De Produtos e Clientes", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Um dos dados está incorreto.",
                    "Cadastro De Produtos e Clientes", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void sairDoPrograma() {
        int sair = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do programa?", "Cadastro de Clientes",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void opcaoInvalida() {
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Por favor escolha uma opção correta \nentre 1 e 5!",
                "Cadastro De Produtos e Clientes", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        new Menu().exibirMenu();
    }
}
