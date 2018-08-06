package com.bank;

import java.util.UUID;

public class User {
   private String id= UUID.randomUUID().toString();
   private String password;
   private String fullName;
   private String address;
   private long accountNumber;
   private String phoneNumber;
   private String email;
   private String secretQuestions;
   private String answerForSecretQuestion;


    public User(
                String password,
                String fullName,
                String address,
                String phoneNumber,
                String email,
                String secretQuestions,
                String answerForSecretQuestion) {

        this.id = UUID.randomUUID().toString();
        this.password = password;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.secretQuestions = secretQuestions;
        this.answerForSecretQuestion = answerForSecretQuestion;
}


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecretQuestions() {
        return secretQuestions;
    }

    public void setSecretQuestions(String secretQuestions) {
        this.secretQuestions = secretQuestions;
    }

    public String getAnswerForSecretQuestion() {
        return answerForSecretQuestion;
    }

    public void setAnswerForSecretQuestion(String answerForSecretQuestion) {
        this.answerForSecretQuestion = answerForSecretQuestion;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", accountNumber=" + accountNumber +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", secretQuestions='" + secretQuestions + '\'' +
                ", answerForSecretQuestion='" + answerForSecretQuestion + '\'' +
                '}';
    }
}
