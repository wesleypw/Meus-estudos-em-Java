import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
       String opcao = JOptionPane.showInputDialog(null, "Qual a sua opção", JOptionPane.QUESTION_MESSAGE);
       String nome = "";
       String valorProduto = "";
       String valorVenda = "";
       switch(opcao) {
           case "1":
               nome = JOptionPane.showInputDialog(null, "Qual o seu nome", JOptionPane.QUESTION_MESSAGE);
               break;
           case "2":
               valorProduto = JOptionPane.showInputDialog(null, "Qual o valor do produto", JOptionPane.QUESTION_MESSAGE);
               break;
           case "3":
              valorVenda = JOptionPane.showInputDialog(null, "Qual o valor da venda", JOptionPane.QUESTION_MESSAGE);
               break;
           default:
               throw new AssertionError("Opção inválida");
       }
       String mensagem = String.format("Bem vindo %s, o valor do produto é %s e o valor da venda é %s",nome,valorProduto,valorVenda);
       JOptionPane.showMessageDialog(null,mensagem);
       
    }
}