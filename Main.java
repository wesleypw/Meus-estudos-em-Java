public class Main{
    public static void main(String[] args) {
        Produto p = new Produto();
        Venda v = new Venda();
        Fornecedor f = new Fornecedor();
        Estoque e = new Estoque();
        v.setNumeroDaNotaFiscal(100);
        v.setDataVenda("10/10/2023");
        v.setHoraVenda("10:10:10");
        v.setValorTotal(1000);

        f.setCnpj(12345678901234L);
        f.setEscricaoEstadual("12345678901234");
        f.setRazaoSocial("12345678901234");
        f.setEndereco("12345678901234");
        f.setNomeFantasia("12345678901234");
        f.setNumero(1234567890);
        f.setEstado("12345678901234");

        e.setQuantidadeTotal(100);
        e.setLocalizacao("12345678901234");
        e.setDataVencimento("10/10/2023");
        e.setCategoria("12345678901234");


        p.setNomeProduto("sabonete");
        p.setCodigoDeBarra(90);
        p.setValorUnitario(100);
        p.setMarca("dove");
        p.setQuantidade(10);

        System.out.println("***********************");
        System.out.println("nome do produto é " + p.getNomeProduto());
        System.out.println("codigo de barra é " + p.getCodigoDeBarra());
        System.out.println("valo unitario é " + p.getValorUnitario());
        System.out.println("marca é " + p.getMarca());
        System.out.println("quantidade é " + p.getQuantidade());    
        

        System.out.println("-----------------------------");

        System.out.println("numero da nota fiscal é " + v.getNumeroDaNotaFiscal());
        System.out.println("data da venda é " + v.getDataVenda());
        System.out.println("hora da venda é " + v.getHoraVenda());
        System.out.println("valor total é " + v.getValorTotal());

    }
}