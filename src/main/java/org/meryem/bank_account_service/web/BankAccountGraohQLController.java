package org.meryem.bank_account_service.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.meryem.bank_account_service.dto.BankAccountRequestDTO;
import org.meryem.bank_account_service.dto.BankAccountResponseDTO;
import org.meryem.bank_account_service.entities.BankAccount;
import org.meryem.bank_account_service.entities.Customer;
import org.meryem.bank_account_service.repositories.BankAccountRepository;
import org.meryem.bank_account_service.repositories.CustomerRepository;
import org.meryem.bank_account_service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BankAccountGraohQLController {
@Autowired
    private BankAccountRepository bankAccountRepository;
@Autowired
private AccountService accountService;
private CustomerRepository customerRepository;
     @QueryMapping
     public List<BankAccount> accountsList() {
    return bankAccountRepository.findAll();
}
    @QueryMapping
    public BankAccount bankAccountById(@Argument String id) {
        return bankAccountRepository.findById( id)
                .orElseThrow(()-> new ResourceNotFoundException(String.format("Bank account with id %s not found", id)));
    }
    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount) {
    return accountService.addAccount(bankAccount);
    }
    @MutationMapping
    public BankAccountResponseDTO updateAccount (@Argument String id , @Argument BankAccountRequestDTO bankAccount) {
        return accountService.update(id, bankAccount);
    }
    @MutationMapping
    public boolean deleteAccount (@Argument String id) {
        bankAccountRepository.deleteById(id);
        return true;
    }
    @QueryMapping
    public List<Customer> Customers() {
         return customerRepository.findAll();
    }

}

/*record BankAccountDTO(Double balance , String Type,String currency ) {


}
 */
