public class LixoOrganico extends Lixo {
    private String tempoDecomposicao;
    private String aterro;
    private String compostagem;

    public void setTempoDecomposicao(String tempoDecomposicao) {
        this.tempoDecomposicao = tempoDecomposicao;
    }
    public String getTempoDecomposicao() {
        return tempoDecomposicao;
    }
    public void setAterro(String aterro) {
        this.aterro = aterro;
    }
    public String getAterro() {
        return aterro;
    }
    public void setCompostagem(String compostagem) {
        this.compostagem = compostagem;
    }
    public String getCompostagem() {
        return compostagem;
    }
}
