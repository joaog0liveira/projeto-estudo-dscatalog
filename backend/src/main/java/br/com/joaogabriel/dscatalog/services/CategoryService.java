package br.com.joaogabriel.dscatalog.services;

import br.com.joaogabriel.dscatalog.entities.Category;
import br.com.joaogabriel.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // registra essa classe como um componente que vai participar do sistema de injeção de dependencia automatizada
public class CategoryService {

    @Autowired //injentando um dependencia valida do categoryrepository
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }
}
