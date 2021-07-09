public class Main {
    public static void main (String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 13);

        Bed bed = new Bed("Modern", 4, 3, 50, 8);

        Lamp lamp = new Lamp("Classic", true, 5);

        Bedroom bedRoom = new Bedroom("Camilla", wall1, wall2, wall3, wall4, bed, lamp, ceiling);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }

}
