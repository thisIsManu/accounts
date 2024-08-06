package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class AccountsDto {

    @Max(value = 9999999999L, message = "AccountNumber Must be of 10 digits")
    @Min(value = 1000000000L,message = "AccountNumber Must be of 10 digits")
    @NotNull
    private Long accountNumber;

    @NotEmpty(message = "AccountType can not be null or Empty")
    @NotEmpty(message = "AccountType can not be null or Empty")
    private String accountType;

    @NotEmpty(message = "branchAddress can not be null or Empty")
    private String branchAddress;
}
