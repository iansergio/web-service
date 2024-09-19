package com.iansergio.webservice.repositories;

import com.iansergio.webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
