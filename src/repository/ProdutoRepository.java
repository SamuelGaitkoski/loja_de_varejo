package repository;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import model.Produto;

public class ProdutoRepository implements Repository<Produto> {

    private Set<Produto> bancoProduto = new TreeSet<>();

    @Override
    public boolean cadastrar(Produto entidade) {
        return bancoProduto.add(entidade);
    }

    @Override
    public Set<Produto> listar() {
        return this.bancoProduto;
    }

    @Override
    public Optional<Produto> buscar(int codigo) {
        return this.bancoProduto.stream().filter((obj) -> obj.getCodigo() == codigo).findFirst();
    }

    @Override
    public boolean atualizar(Produto entidade) {
        for (Produto produto : this.bancoProduto) {
            if (produto.getCodigo() == entidade.getCodigo()) {
                produto = entidade;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remover(int codigo) {
        return this.bancoProduto.removeIf(obj -> obj.getCodigo() == codigo);
    }
    
}
