package controller;

import java.util.Optional;
import java.util.Set;

import model.Produto;
import repository.ProdutoRepository;

public class ProdutoController implements Controller<Produto> {

    ProdutoRepository produtoRepository = new ProdutoRepository();

    @Override
    public boolean cadastrar(Produto entidade) {
        if (entidade == null) {
            return false;
        }
        return produtoRepository.cadastrar(entidade);
    }

    @Override
    public Set<Produto> listar() {
        return produtoRepository.listar();
    }

    @Override
    public Optional<Produto> buscar(int codigo) {
        if (codigo < 1) {
            return null;
        }
        return produtoRepository.buscar(codigo);
    }

    @Override
    public boolean atualizar(Produto entidade) {
        if (entidade == null) {
            return false;
        }
        return produtoRepository.atualizar(entidade);
    }

    @Override
    public boolean remover(int codigo) {
        if (codigo < 1) {
            return false;
        }
        return produtoRepository.remover(codigo);
    }
    
}
