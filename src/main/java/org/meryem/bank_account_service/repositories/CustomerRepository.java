package org.meryem.bank_account_service.repositories;

import org.meryem.bank_account_service.entities.BankAccount;
import org.meryem.bank_account_service.entities.Customer;
import org.meryem.bank_account_service.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    }