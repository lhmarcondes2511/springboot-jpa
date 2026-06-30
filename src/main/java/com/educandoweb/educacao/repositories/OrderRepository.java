package com.educandoweb.educacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.educacao.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
