package com.txb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.txb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}