public interface mathnumbers5 {
    void show();

}

class one extends two implements mathnumbers5 {
    public void n() {
        System.out.println("yes, number 1 is a mathematical number");
        System.out.println();
        System.out.println("number 2 follows as usual");

    }

}

class two {// parent class of one
    public void show() {

    }

    class three extends four {
        public void you() {
            System.out.println("so 3 and 4");

        }

    }

    class four extends two {
        void chall() {
            System.out.println("also mathematical number");
        }
    }

    public static void main(String[] args) {
        one first = new one();
        two second = new two();

        first.n();
        second.show();
        System.out.println();
        System.out.println("alright");

    }

}
