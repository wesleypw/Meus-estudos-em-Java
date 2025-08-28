public class Itens {
    private String nomeItem;
    private int quantidade;
    private float valorUnitario;
    private float valorTotal;
    private String descricao;
    private String codigo;
    
    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }
    public String getNomeItem() {
        return nomeItem;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public float getValorUnitario() {
        return valorUnitario;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }
    
    // Método para calcular o valor total
    public void calcularValorTotal() {
        this.valorTotal = this.quantidade * this.valorUnitario;
    }
}
