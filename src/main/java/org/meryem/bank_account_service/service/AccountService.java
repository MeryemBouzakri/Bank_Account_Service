package org.meryem.bank_account_service.service;

import org.meryem.bank_account_service.dto.BankAccountRequestDTO;
import org.meryem.bank_account_service.dto.BankAccountResponseDTO;
import org.meryem.bank_account_service.entities.BankAccount;

public interface AccountService  {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO update(String id, BankAccountRequestDTO bankAccountDTO);
}
