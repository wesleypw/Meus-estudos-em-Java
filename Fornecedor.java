public class Fornecedor {
    private long cnpj;
    private String escricaoEstadual;
    private String razaoSocial;
    private String endereco;
    private String nomeFantasia;
    private int numero;
    private String estado;
    private int cep;
    private int telefone;
    private String email;
    private String status;

    public void setCnpj(long cnpj){
        this.cnpj = cnpj;
    }
    public long getCnpj(){
        return cnpj;
    }
    public void setEscricaoEstadual(String escricaoEstadual){
        this.escricaoEstadual = escricaoEstadual;
    }
    public String getEscricaoEstadual(){
        return escricaoEstadual;
    }
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
    public String getRazaoSocial(){
        return razaoSocial;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }
    public String getNomeFantasia(){
        return nomeFantasia;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
    public int getCep(){
        return cep;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    public int getTelefone(){
        return telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }

}
