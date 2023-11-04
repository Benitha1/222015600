// this class demonstrates the use of if...else statement in java
public class elseif {
    public static void main(String args[]) { // the main method
        int x = 30; // declare variable and assigning a value
        
        if (x == 10) { //check if x is equal to 10,20 or 30
            System.out.print("x is equal to 10"); // print a message if x is equal to 10
        }
        else if (x == 20) { // check if x is equal to 20
            System.out.print("x is equal to 20"); // //print a message if x is equal to 20
        } 
        else if (x == 30) { // check if x is equal to 30
            System.out.print("x is equal to 30"); // print a message if x is equal to 30
        } else {
            System.out.println("x is not equal to 12,20 and 30"); // print a message if x is not equal to any of above value
        }
    }
}
