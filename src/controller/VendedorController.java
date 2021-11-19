package controller;

import java.util.Optional;
import java.util.Set;

import model.Vendedor;
import repository.VendedorRepository;

public class VendedorController implements Controller<Vendedor>{

    private VendedorRepository vendedorRepository = new VendedorRepository();

    @Override
    public boolean cadastrar(Vendedor entidade) {
        if (entidade == null) {
            return false;
        }
        return vendedorRepository.cadastrar(entidade);
    }

    @Override
    public Set<Vendedor> listar() {
        return vendedorRepository.listar();
    }

    @Override
    public Optional<Vendedor> buscar(int codigo) {
        if (codigo < 1) {
            return null;
        }
        return vendedorRepository.buscar(codigo);
    }

    @Override
    public boolean atualizar(Vendedor entidade) {
        if (entidade == null) {
            return false;
        }
        return vendedorRepository.atualizar(entidade);
    }

    @Override
    public boolean remover(int codigo) {
        if (codigo < 1) {
            return false;
        }
        return vendedorRepository.remover(codigo);
    }

    
    
}
