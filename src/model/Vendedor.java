package model;

public class Vendedor implements Comparable<Vendedor> {
    private int codigo;
    private String nome;
    private String cpf;
    private String rg;
    private String cargo;
    private float salario;
    private int cargaHoraria;
    private String endereco;

    public Vendedor(int codigo, String nome, String cpf, String rg, String cargo, Float salario, int cargaHoraria, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cargo = cargo;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.endereco = endereco;
    }    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public int compareTo(Vendedor vendedor) {
        if(this.codigo == vendedor.getCodigo()) {
            return 0;
        } else if (this.codigo > vendedor.getCodigo()) {
            return 1;
        } else {
            return -1;
        } 
    }

}
