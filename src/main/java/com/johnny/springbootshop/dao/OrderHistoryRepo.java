package com.johnny.springbootshop.dao;

import com.johnny.springbootshop.entity.OrderHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
public interface OrderHistoryRepo extends JpaRepository<OrderHistory, Long> {
    Page<OrderHistory> findByUserIdContaining(@RequestParam("user_id") String userId, Pageable pageable);
}

