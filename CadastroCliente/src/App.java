import br.com.cmelo.dao.ClienteMapDAO;
import br.com.cmelo.dao.IClienteDAO;
import br.com.cmelo.domain.Cliente;

import javax.swing.*;

public class App {
    private static IClienteDAO iclienteDAO;

    public static void main(String[] args) {
         iclienteDAO = new ClienteMapDAO();
//JOptionPane é do pacote SWING(telas)
         String opcao = JOptionPane.showInputDialog(null,
                 "Digite 1 para Cadastrar, " +
                 " 2 para Consultar," +
                 " 3 para Exclusão," +
                 " 4 para Alteração " +
                 " ou 5 para Sair.",
                 "Cadastro",
                 JOptionPane.INFORMATION_MESSAGE);

         while (!isOpcaoValida(opcao)){
             if ("".equals(opcao)){
                 sair();
             }
             //nesse trecho no cod do professor existe um "Green Dinner" como title, não entendi o uso.
             opcao = JOptionPane.showInputDialog(null, "Opção inválida, digite Digite 1 para Cadastrar, 2 para Consultar, " +
                     "3 para Exclusão, 4 para Alteração ou 5 para Sair.", JOptionPane.INFORMATION_MESSAGE);
         }

         while (isOpcaoValida(opcao)){

             if(isOpcaoSair(opcao)) {
                 sair();

             } else if (isCadastro(opcao)) {
                 String dados = JOptionPane.showInputDialog(null,
                         "Digite os dados do cliente separados por vírgula, conforme o exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                         " Cadastro", JOptionPane.INFORMATION_MESSAGE);
                 cadastrar(dados);
                 } else if (isExclusao(opcao)){
        String dados = JOptionPane.showInputDialog(null,
                "Digite o CPF do cliente",
                "Consulta de" +
                        " cliente para exclusão", JOptionPane.INFORMATION_MESSAGE);
        exclusao(dados);
                 }
                 else if(isConsultar(opcao)) {
                 String dados = JOptionPane.showInputDialog(null,
                         "Digite o CPF",
                         "Consultar", JOptionPane.INFORMATION_MESSAGE);
                 consultar(dados);
             } else {
                     String dados = JOptionPane.showInputDialog(null,
                             "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                             "Atualização", JOptionPane.INFORMATION_MESSAGE);
                 atualizar(dados);
             }

             opcao = JOptionPane.showInputDialog(null,
                     "Digite: 1 para Cadastrar, 2 para Consultar, " +
                     "3 para Exclusão, 4 para Alteração ou 5 para Sair.", JOptionPane.INFORMATION_MESSAGE);
         }
         }



    private static void exclusao(String dados) {
        iclienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null,
                "Cliente excluído com sucesso!", "Exclusão", JOptionPane.INFORMATION_MESSAGE);}

    private static void consultar(String dados) {
        //Validação apenas do CPF (numeros)
       Cliente cliente = iclienteDAO.consultar(Long.parseLong(dados));
       if (cliente != null) {
           JOptionPane.showMessageDialog(null,"Cliente encontrado:" + cliente.toString(),"Consultar",JOptionPane.INFORMATION_MESSAGE);

       } else {
           JOptionPane.showMessageDialog(null,"Cliente não encontrado","Consultar",JOptionPane.INFORMATION_MESSAGE);
       }

    }


    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        iclienteDAO.alterar(cliente);
    }

    //tentar validar se todos os campos estão preenchidos, se não estiverem, passar o null no construtor onde o valor é nulo
    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iclienteDAO.cadastrar(cliente);
        if (isCadastrado){
            JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null,"Cliente já cadastrado.", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao) {
        if ("1". equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isConsultar(String dados) {
        if ("2".equals(dados)) {
            return true;
        }
        return false;
    }
    private static boolean isExclusao(String opcao) {
        if ("3".equals(opcao)){
            return true;
        }
        return false;
    }
    private static boolean isAtualizar(String opcao){
        if ("4".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
    if ("5".equals(opcao)){
        return  true;
}
    return false;
}

private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo ", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao)
        || "4".equals(opcao) || "5".equals(opcao)){
    return true;
        }
        return false;
    }

}

