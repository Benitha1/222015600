class market {

    public void ma() {

        System.out.println(" list of items we have in market");
    }
}

interface supplier {
    void show();
}

class customer extends market {
    public void cu() {
        System.out.println("customer buys potatoes");
    }
}

class product extends customer implements supplier {
    public void show() {
    }
}

class carrots extends product {
    public void be() {
        System.out.println("there will be delicious carrots");
    }
}

class saucepan {
    public static void main(String[] args) {

        carrots Carrots = new carrots();

        System.out.println();// jump line
        Carrots.ma();// list of items we have in market
        Carrots.cu();// customer buys potatoes
        Carrots.be();// there will be delicious carrots
        System.out.println();// jump line

    }
}
