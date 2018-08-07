package com.bank;

import com.bank.User;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<User> users;
    String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addUser(String password, String fullName, String address, String phoneNumber, String email, String secretQuestion,
                        String answerToSecretQuestion) {

        User newUser = new User(password, fullName, address, phoneNumber, email, secretQuestion, answerToSecretQuestion);
        users.add(newUser);

    }

    public void addUser(User user) {
        users.add(user);
    }

    public Double totalAmountOfUser(String userId) {
double sum =0;
for (User user : users){
    if(user.getId().equals(userId)){
        return user.totalAmountOfMoney();
    }
}
return null;

    }
public void addMoneytoUser (String UserId, long accountId, double amountOfMoney){


}
}
