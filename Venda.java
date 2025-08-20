
public class Venda{
    private long numeroDaNotaFiscal;
    private String dataVenda;
    private String horaVenda;
    private float valorTotal;

    public void setNumeroDaNotaFiscal(long numeroDaNotaFiscal){
        this.numeroDaNotaFiscal = numeroDaNotaFiscal;
    }
    public long getNumeroDaNotaFiscal(){
        return numeroDaNotaFiscal;
    }
    public void setDataVenda(String dataVenda){
        this.dataVenda = dataVenda;
    }
    public String getDataVenda(){
        return dataVenda;
    }
    public void setHoraVenda(String horaVenda){
        this.horaVenda = horaVenda;
    }
    public String getHoraVenda(){
        return horaVenda;
    }
    public void setValorTotal(float valorTotal){
        this.valorTotal = valorTotal;
    }
    public float getValorTotal(){
        return valorTotal;
    }
}