package model;

import java.time.LocalDate;

public class Produto implements Comparable<Produto> {
    private int codigo;
    private String nome;
    private String marca;
    private String cor;
    private String material;
    private float preco;
    private LocalDate dataFabricacao;

    public Produto (int codigo, String nome, String marca, String cor, String material, float preco, LocalDate dataFabricacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.material = material;
        this.preco = preco;
        this.dataFabricacao = dataFabricacao;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getCor() {
        return this.cor;
    }

    public String getMaterial() {
        return this.material;
    }

    public float getPreco() {
        return this.preco;
    }

    public LocalDate getDataFabricacao() {
        return this.dataFabricacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public int compareTo(Produto produto) {
        if(this.codigo == produto.getCodigo()) {
            return 0;
        } else if (this.codigo > produto.getCodigo()) {
            return 1;
        } else {
            return -1;
        } 
    }
    
}
