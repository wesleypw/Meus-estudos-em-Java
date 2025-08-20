public class Estoque {
    private int quantidadeTotal;
    private String localizacao;
    private String dataVencimento;
    private String categoria;

    public void setQuantidadeTotal(int quantidadeTotal){
        this.quantidadeTotal = quantidadeTotal;
    }
    public int getQuantidadeTotal(){
        return quantidadeTotal;
    }
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
    public String getLocalizacao(){
        return localizacao;
    }
    public void setDataVencimento(String dataVencimento){
        this.dataVencimento = dataVencimento;
    }
    public String getDataVencimento(){
        return dataVencimento;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return categoria;
    }


}
