package repository;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import model.Fornecedor;

public class FornecedorRepository implements Repository<Fornecedor> {

    private Set<Fornecedor> bancoFornecedor = new TreeSet<>();

    @Override
    public boolean cadastrar(Fornecedor entidade) {
        return bancoFornecedor.add(entidade);
    }

    @Override
    public Set<Fornecedor> listar() {
        return this.bancoFornecedor;
    }

    @Override
    public Optional<Fornecedor> buscar(int codigo) {
        return this.bancoFornecedor.stream().filter((obj) -> obj.getCodigo() == codigo).findFirst();
    }

    @Override
    public boolean atualizar(Fornecedor entidade) {
        for (Fornecedor fornecedor : this.bancoFornecedor) {
            if (fornecedor.getCodigo() == entidade.getCodigo()) {
                fornecedor = entidade;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remover(int codigo) {
        return this.bancoFornecedor.removeIf(obj -> obj.getCodigo() == codigo);
    }
    
}
