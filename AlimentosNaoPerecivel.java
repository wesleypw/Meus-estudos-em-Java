public class AlimentosNaoPerecivel extends Alimento {
    protected String instrucaoConservacao;
    protected String conservante;
     
    public void setInstrucaoConservacao(String instrucaoConservacao) {
        this.instrucaoConservacao = instrucaoConservacao;
    }
    public String getInstrucaoConservacao() {
        return instrucaoConservacao;
    }
    public void setConservante(String conservante) {
        this.conservante = conservante;
    }
    public String getConservante() {
        return conservante;
    }
    
}
