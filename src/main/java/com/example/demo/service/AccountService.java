package com.example.demo.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;



@Repository
public interface AccountService extends CrudRepository<Account, Long> {
	
	@Query("SELECT a FROM Account a WHERE account_number = :account_number")
    public Account findByAccountNumber(@Param("account_number") String accountNo);
}


