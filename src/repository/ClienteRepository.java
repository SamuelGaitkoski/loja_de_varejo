package repository;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import model.Cliente;

public class ClienteRepository implements Repository<Cliente> {

    private Set<Cliente> bancoCliente = new TreeSet<>();

    @Override
    public boolean cadastrar(Cliente entidade) {
        return bancoCliente.add(entidade);
    }

    @Override
    public Set<Cliente> listar() {
        return this.bancoCliente;
    }

    @Override
    public Optional<Cliente> buscar(int codigo) {
        return this.bancoCliente.stream().filter((obj) -> obj.getCodigo() == codigo).findFirst();
    }

    @Override
    public boolean atualizar(Cliente entidade) {
        for (Cliente cliente : this.bancoCliente) {
            if (cliente.getCodigo() == entidade.getCodigo()) {
                cliente = entidade;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remover(int codigo) {
        return this.bancoCliente.removeIf(obj -> obj.getCodigo() == codigo);
    }
    
}
