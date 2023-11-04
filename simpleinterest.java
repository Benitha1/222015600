
public class simpleinterest { // class name

    public double multiplication(double p, double r, double t) { // class method

        return p * r / 100 * t; // return value

    }

    public static void main(String args[]) { // mandatory main method

        simpleinterest myMultip = new simpleinterest(); // object name
    

        double principle = 100000;
        double rate = 5;
        double time = 5;
        double si = myMultip.multiplication(principle, rate, time);// recalling class method

        System.out.println("the simple interest of Mr Bob is" + " " + si);
    }

}
