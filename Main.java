public class Main {
    public static void main(String[] args) {
        Produto p = new Produto();
       




        p.setNomeProduto("sabonete");

        p.setCodigoDeBarra(90);
        p.setValoUnitario(100);
        p.setMarca("dove");
        p.setQuantidade(10);

        System.out.println("***********************");
        System.out.println("nome do produto é " + p.getNomeProduto());
        System.out.println("codigo de barra é " + p.getCodigoDeBarra());
        System.out.println("valo unitario é " + p.getValoUnitario());
        System.out.println("marca é " + p.getMarca());
        System.out.println("quantidade é " + p.getQuantidade());    
        

        System.out.println("-----------------------------");


    }
}