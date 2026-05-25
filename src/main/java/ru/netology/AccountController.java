package ru.netology;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @GetMapping("/accounts")
    public List<Account> getAccounts() {

        return List.of(
                new Account(
                        1,
                        "Alex",
                        "•• 1234",
                        1000,
                        "RUB"
                )
        );
    }
}