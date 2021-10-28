public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo de Almeida";
        paulo.endereco = "Rua Martins da Cunha, Bairro Feitoria, n° 112, cidade São Leopoldo, estado RS";

        Vendedor cristian = new Vendedor();
        cristian.nome = "Cristian Almeida";
        cristian.salario = "R$1000.50";

        System.out.println(cristian.salario);

        Produto produto1 = new Produto();
        produto1.nome = "Iphone 12";
        produto1.marca = "Apple";
        produto1.preco = 5500;
        
        System.out.println(produto1.nome);
        System.out.println(produto1.marca);
        System.out.println(produto1.preco);
    }
}
