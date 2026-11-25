package padroescriacao.prototype;

public class Empresa implements Cloneable {
    private String cnpj;
    private String razaoSocial;
    private Endereco endereco;
    private String localFundacao;

    public Empresa(String cnpj, String razaoSocial, Endereco endereco, String localFundacao) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.localFundacao = localFundacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getLocalFundacao() {
        return localFundacao;
    }

    public void setLocalFundacao(String localFundacao) {
        this.localFundacao = localFundacao;
    }

    @Override
    public Empresa clone() throws CloneNotSupportedException {
        Empresa empresaClone = (Empresa) super.clone();
        empresaClone.endereco = (Endereco) empresaClone.endereco.clone();
        return empresaClone;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", endereco=" + endereco +
                ", localFundacao='" + localFundacao + '\'' +
                '}';
    }
}
