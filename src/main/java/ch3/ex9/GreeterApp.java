package ch3.ex9;

public class GreeterApp {

    public  static void main(String[] args) {

        Greeter annGreeter = new Greeter(10000, "Ann");
        Greeter joeGreeter = new Greeter(500, "Joe");

        //TODO execute concurrently
        new Thread(annGreeter).run();
        new Thread(joeGreeter).run();
    }
}
