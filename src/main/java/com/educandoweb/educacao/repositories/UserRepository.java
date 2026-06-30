package com.educandoweb.educacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.educacao.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
