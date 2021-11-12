import java.time.LocalDate;

public class Produto {
    public String nome;
    public String marca;
    public String cor;
    public String material;
    public float preco;
    public LocalDate dataFabricacao;

    public Produto(String nome, String marca, String cor, String material, float preco, LocalDate dataFabricacao) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.material = material;
        this.preco = preco;
        this.dataFabricacao = dataFabricacao;
    }

    public Produto(String nome) {
        this.nome = nome;
        this.dataFabricacao = LocalDate.now();
    }
}
