package br.com.Model;

public class Anuncio {
    
    private int id;
    private String NomeFantasia;
    private String RazaoSocial;
    private String CNPJ;
    private String Telefone;
    private String Email;
    private String Endereco;
    private String Descricao;
    
    public Anuncio() {
        id = 0;
        NomeFantasia = "";
        RazaoSocial = "";
        CNPJ = "";
        Telefone = "";
        Email = "";
        Endereco = "";
        Descricao = "";
    }

    public Anuncio(String NomeFantasia, String RazaoSocial, String CNPJ, String Telefone, String Email, String Endereco, String Descricao) {
        this.NomeFantasia = NomeFantasia;
        this.RazaoSocial = RazaoSocial;
        this.CNPJ = CNPJ;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Endereco = Endereco;
        this.Descricao = Descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
}
