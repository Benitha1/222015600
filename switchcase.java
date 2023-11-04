public class switchcase { // this class demonstrates the use of switch case statement in java
    public static void main(String[] args) { // main method
        char grade = 'C'; // declare a variable
        switch (grade) { // switch statement to check the value of the grade variable
            case 'A':
                System.out.println("Excellent!"); // print the message if the grade is A
                break;
            case 'B':
                System.out.println("Well done"); // print the message if the grade is B
                break;
            case 'C':
                System.out.println("Well done"); // print the message if the grade is C
                break;
            case 'D':
                System.out.println("You passed"); /// print the message if the grade is D
                break;
            case 'F':
                System.out.println("Better try again"); // print the message if the grade is F
                break;
            default:
                System.out.println("Invalid grade"); // print the message if the grade is invalid

        }
    }
}
