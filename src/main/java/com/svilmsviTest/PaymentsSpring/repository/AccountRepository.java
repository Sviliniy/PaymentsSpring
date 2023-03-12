package com.svilmsviTest.PaymentsSpring.repository;


import com.svilmsviTest.PaymentsSpring.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
