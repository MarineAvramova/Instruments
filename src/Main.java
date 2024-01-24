public class Main {
    public static void main(String[] args) {

    Instruments instrument1 = new StringInstruments();
    instrument1.play(); // Invoke method on those objects

        Instruments instrument2 = new WindInstruments();
    instrument2.play();

    Instruments instrument3 = new Percurssion("Drum", 111);
    instrument3.play();
        {
            System.out.println("Initialization blocks are executed in main method");
        }
    }
    {
        System.out.println("Initialization blocks are executed in main class");
    }
    static { //Static code block
        System.out.println("The static block initization in class Main ");
    }
}