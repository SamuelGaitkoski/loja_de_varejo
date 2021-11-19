package model;

public class Fornecedor implements Comparable<Fornecedor> {
    private int codigo;
    private String nome;
    private String cnpj;
    private String endereco;
    private String produto;

    public Fornecedor(int codigo, String nome, String cnpj, String endereco, String produto) {
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.produto = produto;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getProduto() {
        return this.produto;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public int compareTo(Fornecedor fornecedor) {
        if(this.codigo == fornecedor.getCodigo()) {
            return 0;
        } else if (this.codigo > fornecedor.getCodigo()) {
            return 1;
        } else {
            return -1;
        } 
    }

}
