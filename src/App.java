import java.time.LocalDate;

import controller.ClienteController;
import controller.FornecedorController;
import controller.ProdutoController;
import controller.VendedorController;
import model.Cliente;
import model.Fornecedor;
import model.Produto;
import model.Vendedor;

public class App {
    public static void main(String[] args) {

        //criando um vendedor para consumir nossa API
        VendedorController vendedorController = new VendedorController();
        //cadastrar
        var vendedor1 = new Vendedor(1, "Samuel", "000.000.989-05", "4100000000", "Vendedor", 1500.50f, 8, "Rua Antonio, n° 29");
        vendedorController.cadastrar(vendedor1);
        //buscar
        var buscaVendedor = vendedorController.buscar(1);
        if(buscaVendedor.isPresent()) {
            var obj = buscaVendedor.get();
            System.out.println(obj.getNome());
        } else {
            System.out.println("O vendedor não existe");
        }
        //atualizar
        vendedorController.atualizar(vendedor1);
        //remover
        vendedorController.remover(1);


        //criando um cliente para consumir nossa API
        ClienteController clienteController = new ClienteController();
        //cadastrar
        var cliente1 = new Cliente(1, "Samuel Gaitkoski", "000.000.989-05", "4100000000", "Rua da Silva, Bairro Comunnhão", "samuel.gaitkoski@gmail.com");
        clienteController.cadastrar(cliente1);
        //buscar
        var buscaCliente = clienteController.buscar(1);
        if(buscaCliente.isPresent()) {
            var obj = buscaCliente.get();
            System.out.println(obj.getNome());
        } else {
            System.out.println("O fornecedor não existe");
        }
        //atualizar
        clienteController.atualizar(cliente1);
        //remover
        clienteController.remover(1);


        //criando um fornecedor para consumir nossa API
        FornecedorController fornecedorController = new FornecedorController();
        //cadastrar
        var fornecedor1 = new Fornecedor(1, "Nike", "0000000000001", "Rua Conceição", "Camiseta");
        fornecedorController.cadastrar(fornecedor1);
        //buscar
        var buscaFornecedor = fornecedorController.buscar(1);
        if(buscaFornecedor.isPresent()) {
            var obj = buscaFornecedor.get();
            System.out.println(obj.getNome());
        } else {
            System.out.println("O fornecedor não existe");
        }
        //atualizar
        fornecedorController.atualizar(fornecedor1);
        //remover
        fornecedorController.remover(1);


        //criando um produto para consumir nossa API
        ProdutoController produtoController = new ProdutoController();
        //cadastrar
        var produto1 = new Produto(1, "Camiseta Training", "Nike", "Preto", "Dry-Fit", 90.65f, LocalDate.of(2021, 9, 16));
        produtoController.cadastrar(produto1);
        //buscar
        var buscaProduto = produtoController.buscar(1);
        if(buscaProduto.isPresent()) {
            var obj = buscaProduto.get();
            System.out.println(obj.getNome());
        } else {
            System.out.println("O produto não existe");
        }
        //atualizar
        produtoController.atualizar(produto1);
        //remover
        produtoController.remover(1);
    }
}
