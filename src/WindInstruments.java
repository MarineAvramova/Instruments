class WindInstruments extends Instruments{
    String name = "Trombone";
    int price = 298;

    public WindInstruments() {
        System.out.println("No argument constructor executed in subclass");
    }
    public WindInstruments(String name,int price){
        System.out.println("Two argument constructor executed in subclass");
    }
    static { //Static code block
        System.out.println("The static block initization in subclass WindInstruments");
    }
    {
        System.out.println("Initialization blocks are executed in subclass");
    }


    @Override
    void play() {
        System.out.println("A wind instrument is being played");
    }
}
