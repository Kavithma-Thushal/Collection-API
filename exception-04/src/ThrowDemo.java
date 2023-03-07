/*
    @author DanujaV
    @created 3/7/23 - 9:12 AM   
*/

import java.util.Scanner;

public class ThrowDemo {
    private static void isEligibleForTheVote(int age) {
        if(age < 18) {
            throw new IllegalArgumentException("less than 18");
        }
        System.out.println("eligible for the VOTE :) ");
    }

    public static void main(String[] args) {
        System.out.print("Input age: ");
        int age = new Scanner(System.in).nextInt();

        isEligibleForTheVote(age);
    }
}
