import java.util.Stack;
public class Main {
  public static void main(String[] args) {
     Stack<String> nomes = new Stack<>();   
     nomes.push("Wesley");
     nomes.push("Henrique");
     nomes.push("Silva");
     nomes.push("Diniz");
     nomes.push("algusto");
     nomes.push("Junior");
     nomes.push("ronaldo");
     nomes.push("ana");
     nomes.push("guilerme");
     nomes.push("julia");
     nomes.push("yasmim");
     nomes.push("carol");
     nomes.push("carlos");
     nomes.push("julio");
     nomes.push("juliana");
     nomes.push("augustinho");
     nomes.push("beisola");
     nomes.push("bruno");
     nomes.push("ronaldinho");
     nomes.push("ronaldo");
     nomes.push("matheus");
     nomes.push("lucas");
     nomes.push("altair");
     nomes.push("giumar");
     nomes.push("floresvaldo");
     nomes.push("naruto");
     nomes.push("vedita");
     nomes.push("maria");
     nomes.push("joao");
     nomes.push("pedro");
     nomes.push("marcos");

     System.out.println("esse é o primeiro nome de pilha " + nomes.firstElement());
     System.out.println("esse é o ultimo nome da pilha: " + nomes.peek());
     
     nomes.remove(27);
     nomes.remove(17);
     nomes.remove(12);
     nomes.remove(10);
     nomes.remove(8);
     
     System.out.println(nomes);
     
  }
}

     
  