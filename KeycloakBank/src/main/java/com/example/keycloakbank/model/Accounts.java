	package com.example.keycloakbank.model;


	import com.fasterxml.jackson.annotation.JsonIgnore;
	import jakarta.persistence.*;
	import lombok.Getter;
	import lombok.Setter;

	import java.sql.Date;
	import java.util.List;

	@Entity
	@Getter @Setter
	@Table(name = "accounts")
	public class Accounts extends BaseEntity{



		@Id
		@Column(name="account_number")
		private long accountNumber;

		@Column(name="account_type")
		private String accountType;

		@Column(name = "branch_address")
		private String branchAddress;

		@OneToOne
		@JoinColumn(name = "customer_id")
		private Customer customer;

		@OneToMany(mappedBy = "account",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		@JsonIgnore
		private List<Loans> loans;





	}
