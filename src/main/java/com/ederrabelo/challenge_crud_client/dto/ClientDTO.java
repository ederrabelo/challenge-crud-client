package com.ederrabelo.challenge_crud_client.dto;

import java.time.LocalDate;

import com.ederrabelo.challenge_crud_client.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

public class ClientDTO {
    private Long id;

    @NotBlank(message = "Não pode ser vazio")
    private String name;
    private String cpf;
    private Double income;

    @PastOrPresent(message = "Não pode ser data futura")
    private LocalDate birthDate;
    private Integer children;

    public ClientDTO() {

    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        id = entity.getId(); 
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    
}
