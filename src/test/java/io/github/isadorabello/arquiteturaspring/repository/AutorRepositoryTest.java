package io.github.isadorabello.arquiteturaspring.repository;

import io.github.isadorabello.arquiteturaspring.livraria.model.Autor;
import io.github.isadorabello.arquiteturaspring.livraria.repository.AutorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@SpringBootTest
public class AutorRepositoryTest {

    @Autowired
    AutorRepository repository;

    @Test
    public void salvarAutor(){
        Autor autor = new Autor();
        autor.setNome("Josué Alencar Pereira");
        autor.setNacionalidade("Brasileiro");
        autor.setDataNascimento(LocalDate.of(1967, 11, 5));
        var autorSalvo = repository.save(autor);
        System.out.println(autorSalvo);
    }

    @Test
    public void atualizarAutor(){
        var id = UUID.fromString("ef021f65-388d-46b6-8d47-9483e4ec3081");

        Optional<Autor> procurandoAutor = repository.findById(id);

        if(procurandoAutor.isPresent()){
            Autor autor = procurandoAutor.get();
            System.out.println("Autor encontrado");
            System.out.println(autor);

            autor.setNacionalidade("Chileno");

            repository.save(autor);
        }

    }
}
