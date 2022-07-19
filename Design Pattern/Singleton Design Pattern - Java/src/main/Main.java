package main;

public class Main {
    public static void main(String[] args) {
        Government user1= Government.becomeNewGovernment();
        Government user2= Government.becomeNewGovernment();

        System.out.println(user1);
        System.out.println(user2);
    }
}
