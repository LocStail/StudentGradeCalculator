import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Grade: ");
        int n = input.nextInt();
        System.out.println(getGrade(n));
    }

    static String getGrade(int grade) {

        if (grade < 0 || grade > 100) {
            return "Not valid score!";
        }

        if (grade <= 51) {
            return "You Failed! F";
        }
        if (grade <= 61) {
            return "You Passed! E";
        }
        if (grade <= 71) {
            return "You Passed! D";
        }
        if (grade <= 81) {
            return "You Passed! C";
        }
        if (grade <= 91) {
            return "You Passed! B";
        }

        return "You Passed! A";
    }
}