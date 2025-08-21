public class Main{
    public static void main(String[] args) {
        Produto p = new Produto();
        Venda v = new Venda();
        Fornecedor f = new Fornecedor();
        Estoque e = new Estoque();

        AlimentoPerecivel ap = new AlimentoPerecivel();
        AlimentosNaoPerecivel anp = new AlimentosNaoPerecivel();

        ap.setTemperatura("20");
        ap.setPrazoAbertura("10");
        anp.setInstrucaoConservacao("10");
        anp.setConservante("10");
        anp.setIngredientes("10");
        anp.setMarca("10");
        anp.setNomeProduto("10");
        anp.setCategoria("10");
        anp.setEmbalagem("10");
        anp.setFabricante("10");
        anp.setArmazenamento("10");

        LixoSeco ls = new LixoSeco();
        ls.setMaterial("10");
        ls.setColeta("10");
        ls.setCoperativa("10");


        LixoOrganico lo = new LixoOrganico();
        lo.setTempoDecomposicao("10");
        lo.setAterro("10");
        lo.setCompostagem("10");


       


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

        System.out.println("temperatura é " + ap.getTemperatura());
        System.out.println("prazo de abertura é " + ap.getPrazoAbertura());
        System.out.println("instrucao de conservacao é " + anp.getInstrucaoConservacao());
        System.out.println("conservante é " + anp.getConservante());
        
        System.out.println("material é " + ls.getMaterial());
        System.out.println("coleta é " + ls.getColeta());
        System.out.println("coperativa é " + ls.getCoperativa());
        System.out.println("tempo de decomposicao é " + lo.getTempoDecomposicao());
        System.out.println("aterro é " + lo.getAterro());
        System.out.println("compostagem é " + lo.getCompostagem());


    }
}