package day3;

interface Network {
    void connect();
    void disconnect();
}

class Network2g implements Network {
    public void connect() {
        System.out.println("connected to 2g network");
    }

    public void disconnect() {
        System.out.println("disconnected from 2g network");
    }
}

class Network3g implements Network {
    public void connect() {
        System.out.println("connected to 3g network");
    }

    public void disconnect() {
        System.out.println("disconnected from 3g network");
    }
}

class Network4g implements Network {
    public void connect() {
        System.out.println("connected to 4g network");
    }

    public void disconnect() {
        System.out.println("disconnected from 4g network");
    }
}

class Network5g implements Network {
    public void connect() {
        System.out.println("connected to 5g network");
    }

    public void disconnect() {
        System.out.println("disconnected from 5g network");
    }
}

public class InterfaceImplementation {

    public static void main(String[] args) {
    	
        Network net;
        System.out.println("2g test");
        net = new Network2g();
        net.connect();
        net.disconnect();

        System.out.println("\n3g test");
        net = new Network3g();
        net.connect();
        net.disconnect();

        System.out.println("\n4g test");
        net = new Network4g();
        net.connect();
        net.disconnect();

        System.out.println("\n5g test");
        net = new Network5g();
        net.connect();
        net.disconnect();
    }
}
