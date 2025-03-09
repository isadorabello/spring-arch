package io.github.isadorabello.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository){
        this.repository = todoRepository;
    }

    public TodoEntity salvar (TodoEntity novo){
        return repository.save(novo);
    }

    public TodoEntity atualizarStatus (TodoEntity atualizado){
        return repository.save(atualizado);
    }

    public TodoEntity buscarPorId (Integer id){
        return repository.findById(id).orElse(null);
    }

}
