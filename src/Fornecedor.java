
public class Fornecedor {
    public String nome;
    public String cnpj;
    public String endereco;
    public String produto;

    public Fornecedor(String nome, String cnpj, String endereco, String produto) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.produto = produto;
    }

    public Fornecedor(String nome, String produto) {
        this.nome = nome;
        this.produto = produto;
    }

}
