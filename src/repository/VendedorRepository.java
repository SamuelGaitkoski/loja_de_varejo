package repository;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import model.Vendedor;

public class VendedorRepository implements Repository<Vendedor> {

    private Set<Vendedor> bancoVendedor = new TreeSet<>();

    @Override
    public boolean cadastrar(Vendedor entidade) {
        return bancoVendedor.add(entidade);
    }

    @Override
    public Set<Vendedor> listar() {
        return this.bancoVendedor;
    }

    @Override
    public Optional<Vendedor> buscar(int codigo) {
        return this.bancoVendedor.stream().filter((obj) -> obj.getCodigo() == codigo).findFirst();
    }

    @Override
    public boolean atualizar(Vendedor entidade) {
        for (Vendedor vendedor : this.bancoVendedor) {
            if (vendedor.getCodigo() == entidade.getCodigo()) {
                vendedor = entidade;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remover(int codigo) {
        return this.bancoVendedor.removeIf(obj -> obj.getCodigo() == codigo);
    }
    
}
