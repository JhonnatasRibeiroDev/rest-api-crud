package com.crud.restapi.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class User {
    @Id// Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)// Gera o id automaticamente
    private long id;
    @Column(nullable = false) // Não pode ser nulo
    private String name;
    @Column(nullable = false, unique = true) // Não pode ser nulo e não pode ser repetido
    private String email;
    @Column(nullable = false)// Não pode ser nulo
    private String telefone;
}
