abstract class Instruments {
    String name;
    int price;
    abstract void play();//abstract method doesnt have a body
    static { //Static code block
        System.out.println("The static block initization in abstract class Instruments");
    }
    {
        System.out.println("Initialization blocks are executed in abstract class");
    }
}


