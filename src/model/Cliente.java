package model;

public class Cliente implements Comparable<Cliente> {
    private int codigo;
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String email;

    public Cliente(int codigo, String nome, String cpf, String rg, String endereco, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.email = email;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getEmail() {
        return this.email;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Cliente cliente) {
        if(this.codigo == cliente.getCodigo()) {
            return 0;
        } else if (this.codigo > cliente.getCodigo()) {
            return 1;
        } else {
            return -1;
        } 
    }
}
