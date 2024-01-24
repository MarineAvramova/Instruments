class Percurssion extends Instruments{
    String name;
    int price;

    public Percurssion(String name, int price) {
        this.name = "Drum";
        this.price = 111;
    }

    @Override
    void play() {
        System.out.println("A percussion instrument is playing");
    }
}
