package com.crud.restapi.database;
import com.crud.restapi.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
//
public interface RepositoryUser extends JpaRepository<User, Long>{

    // O JpaRepository já possui os métodos básicos de CRUD
    // Não é necessário implementar os métodos
    // O Spring Data JPA já faz isso automaticamente
    // para inserir um novo usuário, basta chamar o método save()
    // para buscar um usuário, basta chamar o método findById()
    // para buscar todos os usuários, basta chamar o método findAll()
    // para deletar um usuário, basta chamar o método deleteById()
    // para atualizar um usuário, basta chamar o método save()
    
}
