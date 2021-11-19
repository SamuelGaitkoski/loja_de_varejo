package controller;

import java.util.Optional;
import java.util.Set;

import model.Fornecedor;
import repository.FornecedorRepository;

public class FornecedorController implements Controller<Fornecedor> {

    FornecedorRepository fornecedorRepository = new FornecedorRepository();

    @Override
    public boolean cadastrar(Fornecedor entidade) {
        if (entidade == null) {
            return false;
        }
        return fornecedorRepository.cadastrar(entidade);
    }

    @Override
    public Set<Fornecedor> listar() {
        return fornecedorRepository.listar();
    }

    @Override
    public Optional<Fornecedor> buscar(int codigo) {
        if (codigo < 1) {
            return null;
        }
        return fornecedorRepository.buscar(codigo);
    }

    @Override
    public boolean atualizar(Fornecedor entidade) {
        if (entidade == null) {
            return false;
        }
        return fornecedorRepository.atualizar(entidade);
    }

    @Override
    public boolean remover(int codigo) {
        if (codigo < 1) {
            return false;
        }
        return fornecedorRepository.remover(codigo);
    }
    
}
