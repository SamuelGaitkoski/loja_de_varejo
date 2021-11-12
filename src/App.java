import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        //Endereco
        Endereco endereco1 = new Endereco("Martin Luther", "421", "Illinois", "Santiago", "Alabama", "45969-000");
        Endereco endereco2 = new Endereco("Ambarino", "2018", "New Hanover", "Valentine", "New Austin", "26903-000");

        System.out.println(endereco1.getEndereco().toUpperCase());
        System.out.println(endereco2.getEndereco());
        System.out.println();

        //Venda
        var venda01 = new Venda("Camiseta");
        var venda02 = new Venda(null, null, null);
        var venda03 = new Venda("Tenis", LocalDate.of(2021, 11, 01), LocalDate.of(2019, 12, 20));
        var vendaInvalida01 = new Venda();

        System.out.println();
        System.out.println(venda01.produto);
        System.out.println(venda01.dataVenda);
        System.out.println(venda02.dataVenda);
        System.out.printf("O produto vendido foi %s, venda realizada em: %s, entrega realizada em: %s", venda03.produto, 
        venda03.dataVenda, venda03.dataEntrega);
        System.out.println();
        System.out.println(vendaInvalida01.produto);

        //Transportadora
        var transportadora01 = new Transportadora("Expresso São Miguel");
        var transportadora02 = new Transportadora(null);
        System.out.println();
        System.out.println(transportadora01.nome);
        System.out.println(transportadora02.nome);

        //Vendedor
        var vendedor01 = new Vendedor("Cléber", "062.037.123-00", "5612008978", "Vendedor", 3000.50f, 8, "Rua José da Silva, 310, Bairro Concórdia, Cidade São Lourenço, Maranhão/BA");
        var vendedor02 = new Vendedor(null);

        System.out.println();
        System.out.printf("O funcionário %s, de cpf %s, de rg %s, cujo cargo é de %s, e salário é de R$%f, e carga horária é de %d horas, mora na %s", vendedor01.nome, vendedor01.cpf, vendedor01.rg, vendedor01.cargo, vendedor01.salario, vendedor01.cargaHoraria, vendedor01.endereco);
        System.out.println();
        System.out.println(vendedor02.nome);

        //Cliente
        var cliente01 = new Cliente("Alexandre", "032.415.845-20", "9687023256", "Rua das Hortências, n° 119, bairro Rodrigues, Gravataí/RS", "alexandre2017@gmail.com");

        System.out.println();
        System.out.printf("%s - %s - %s - %s - %s", cliente01.nome, cliente01.cpf, cliente01.rg, cliente01.endereco, cliente01.email);

        //Fornecedor
        var fornecedor01 = new Fornecedor("Renner", "69.020.130/0001-92", "Rua Osvaldino, n° 25, bairro João da Rosa, cidade Canoas/RS", "Vestuário masculino e feminino");
        var fornecedor02 = new Fornecedor("Cavalera Ltda.", "Camiseta");

        System.out.println();
        System.out.println();
        System.out.printf("%s - %s - %s - %s", fornecedor01.nome, fornecedor01.cnpj, fornecedor01.endereco, fornecedor01.produto);
        System.out.println();
        System.out.printf("%s - %s", fornecedor02.nome, fornecedor02.produto);

        //Produto
        var produto01 = new Produto("Calça", "Marfinno", "Preto", "Algodão", 150.00f, LocalDate.of(2019, 06, 17));
        var produto02 = new Produto("Camisa");

        System.out.println();
        System.out.println();
        System.out.printf("%s - %s - %s - %s - %.2f - %s", produto01.nome, produto01.marca, produto01.cor, produto01.material, produto01.preco, produto01.dataFabricacao);
        System.out.println();
        System.out.printf("%s - %s", produto02.nome, produto02.dataFabricacao);
    }
}
