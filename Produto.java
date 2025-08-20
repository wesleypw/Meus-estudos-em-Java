public class Produto{
    private String nomeProduto;
    private int codigoDeBarra;
    private int valorUnitario;
    private String marca;
    private int quantidade;


    
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    } 
    public String getNomeProduto(){
        return nomeProduto;
    }

    public void setCodigoDeBarra(int codigoDeBarra){
        this.codigoDeBarra = codigoDeBarra;
    }
    public int getCodigoDeBarra(){
        return codigoDeBarra;
    } 
    public void setValorUnitario(int valorUnitario){
        this.valorUnitario= valorUnitario;
    } 
    public int getValorUnitario(){
        return valorUnitario;
    } 
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }

}