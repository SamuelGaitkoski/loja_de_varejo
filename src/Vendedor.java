public class Vendedor {
    public String nome;
    public String cpf;
    public String rg;
    public String cargo;
    public float salario;
    public int cargaHoraria;
    public String endereco;

    //construtores
    public Vendedor(String nome, String cpf, String rg, String cargo, Float salario, int cargaHoraria, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cargo = cargo;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.endereco = endereco;
    }    

    public Vendedor(String nome) {
        
    }
}
