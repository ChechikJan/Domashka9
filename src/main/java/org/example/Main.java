package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Васильевич";
        post.passport = "5555№555555";
        post.phone = "+7 (999)-888-77-66";
        post.subscription = true;

        post.birthday.day = 15;
        post.birthday.month = 12;
        post.birthday.year = 1977;


    }
}