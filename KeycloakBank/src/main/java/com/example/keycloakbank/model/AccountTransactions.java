package com.example.keycloakbank.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name="account_transactions")
public class AccountTransactions extends  BaseEntity{
	
	@Id
	@Column(name = "transaction_id")
	private String transactionId;
	
	@Column(name="account_number")
	private long accountNumber;
	
	@Column(name = "customer_id")
	private long customerId;
	
	@Column(name="transaction_dt")
	private Date transactionDt;
	
	@Column(name = "transaction_summary")
	private String transactionSummary;
	
	@Column(name="transaction_type")
	private String transactionType;
	
	@Column(name = "transaction_amt")
	private int transactionAmt;
	
	@Column(name = "closing_balance")
	private int closingBalance;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "customer_id")
	private Customer customer;

}
