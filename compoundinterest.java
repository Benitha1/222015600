public class compoundinterest {// class name
    public double monthly(double p, double r, double t, double n) {// class method

        return p * Math.pow(1 + (r / n), (n * t)); // return value
    }

    public static void main(String args[]) { // mandatory main method

        compoundinterest dCompoundinterest = new compoundinterest(); // object name

        // initializing values
        double principle = 500000;
        double rate = 0.18;
        double time = 3;
        double N = 12;
        double ci = dCompoundinterest.monthly(principle, rate, time, N); // recalling class method

        System.out.println("the compound interest of Mr Bob is" + " " + ci); // output
    }

}
