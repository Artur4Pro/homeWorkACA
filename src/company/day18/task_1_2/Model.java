package company.day18.task_1_2;

import company.validator.PersonValidator;

import java.util.Scanner;

public class Model {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String lastName;
        String passportId;
        int age;
        String gender;
        String nationality;

        System.out.println("Enter Firstname");
        while (true) {
            firstName = scanner.nextLine();
            if (PersonValidator.isValidFirstName(firstName)) {
                break;
            } else {
                System.out.println("Invalid name, please enter valid name");
            }
        }
        System.out.println("Enter Lastname");
        while (true) {
            lastName = scanner.nextLine();
            if (PersonValidator.isValidLastName(lastName)) {
                break;
            } else {
                System.out.println("Invalid lastname, please enter valid lastname");
            }
        }
        System.out.println("Enter Passport ID");
        while (true) {
            passportId = scanner.nextLine();
            if (PersonValidator.isValidPassportId(passportId)) {
                break;
            } else {
                System.out.println("Invalid passport Id, please enter valid ID");
            }
        }
        System.out.println("Enter age");
        while (true) {
            age = scanner.nextInt();
            if (PersonValidator.isValidAge(age)) {
                break;
            } else {
                System.out.println("Invalid age, please enter valid age");
            }
        }
        System.out.println("Enter Gender");
        while (true) {
            gender = scanner.nextLine();
            if (PersonValidator.isValidGender(gender)) {
                break;
            } else {
                System.out.println("Invalid gender, please enter valid gender");
            }
        }
        System.out.println("Enter Nation");

        while (true) {
            nationality = scanner.nextLine();
            if (PersonValidator.isValidNationality(nationality)) {
                break;
            } else {
                System.out.println("Invalid Nation , enter valid");
            }
        }
        Person person = new Person(firstName, lastName, passportId, age, gender, nationality);


    }
}