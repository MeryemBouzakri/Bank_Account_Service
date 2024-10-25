package org.meryem.bank_account_service.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.meryem.bank_account_service.enums.AccountType;

import java.util.Date;
@Data @Builder @AllArgsConstructor @NoArgsConstructor

public class BankAccountResponseDTO {
    private String id;
    private Date createdAt;
    private Double balance;
    private String currency;
    private AccountType type;

}
