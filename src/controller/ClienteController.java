package controller;

import java.util.Optional;
import java.util.Set;

import model.Cliente;
import repository.ClienteRepository;

public class ClienteController implements Controller<Cliente> {

    private ClienteRepository clienteRepository = new ClienteRepository();

    @Override
    public boolean cadastrar(Cliente entidade) {
        if (entidade == null) {
            return false;
        }
        return clienteRepository.cadastrar(entidade);
    }

    @Override
    public Set<Cliente> listar() {
        return clienteRepository.listar();
    }

    @Override
    public Optional<Cliente> buscar(int codigo) {
        if (codigo < 1) {
            return null;
        }
        return clienteRepository.buscar(codigo);
    }

    @Override
    public boolean atualizar(Cliente entidade) {
        if (entidade == null) {
            return false;
        }
        return clienteRepository.atualizar(entidade);
    }

    @Override
    public boolean remover(int codigo) {
        if (codigo < 1) {
            return false;
        }
        return clienteRepository.remover(codigo);
    }
    
}
