public class whileloop { // this class demonstrates the use of while loop in java
    public static void main(String args[]) { // main method
       // declare a variable to storethe current loop iteration 
        int count = 0;
        while (count < 10) { // while loop to count from 1 to 10
            System.out.print("count:" + count); // print out the loop iteration
            count++;
            System.out.print("\n"); // jump to the next line
        }

    }
}
