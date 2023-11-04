// this class defines a nested for loop
public class nestedforloop {
    public static void main(String args[]) { // main method
        for (int i = 0; i < 5; i++) { // declare a variable as integer i and store outer loop iteration from 1 to 5
            for (int j = 0; j < 5; j++) { // // declare a variable as integer j and store  inner loop iteration from 1 to 5
                System.out.print("*"); // print the current loop iteraration
            }
            System.out.println(); // print a new line character
        }
    }
}
