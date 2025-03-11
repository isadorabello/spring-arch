package io.github.isadorabello.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service // com excessão do controller, outras classes podem ser anotadas como @Component (ao invés de @Service, por exemplo.
// @Service é usado como uma forma semântica de separação no spring, mas dado que são todos "filhos" de @Component, não afetará a aplicação)
public class TodoService {

    private TodoRepository repository;
    private ToDoValidator validator;
    private MailSender sender;

    public TodoService(TodoRepository todoRepository, ToDoValidator validator, MailSender mail){
        this.repository = todoRepository;
        this.validator = validator;
        this.sender = mail;
    }

    public TodoEntity salvar (TodoEntity novo){
        validator.validar(novo);
        return repository.save(novo);
    }

    public TodoEntity atualizarStatus (TodoEntity atualizado){
        repository.save(atualizado);
        String status = atualizado.getConcluido() == Boolean.TRUE ? "concluído" : "não concluído";
        sender.enviar("ToDo '" + atualizado.getDescricao() + "' foi atualizado para " + status);
        return atualizado;
    }

    public TodoEntity buscarPorId (Integer id){
        return repository.findById(id).orElse(null);
    }

}
