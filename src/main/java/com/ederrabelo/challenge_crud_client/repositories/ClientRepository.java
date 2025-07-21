package com.ederrabelo.challenge_crud_client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederrabelo.challenge_crud_client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
