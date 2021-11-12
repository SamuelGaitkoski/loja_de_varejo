import java.time.LocalDate;

public class Venda {
    public LocalDate dataVenda;
    public LocalDate dataEntrega;
    public String produto;

    //construtores
    public Venda() {
        this.dataVenda = LocalDate.now();
     }

    public Venda(String produto) {
        this.produto = produto;
        this.dataVenda = LocalDate.now();
    }

    public Venda(String produto, LocalDate dataVenda, LocalDate dataEntrega) {
        this.produto = produto;
        this.dataVenda = dataVenda;
        this.dataEntrega = dataEntrega;
    }
}



