package com.educandoweb.educacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.educacao.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
