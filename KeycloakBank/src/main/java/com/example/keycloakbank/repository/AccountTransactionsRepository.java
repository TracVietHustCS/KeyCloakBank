package com.example.keycloakbank.repository;

import java.util.List;

import com.example.keycloakbank.model.AccountTransactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, String> {

	List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(long customerId);

}
