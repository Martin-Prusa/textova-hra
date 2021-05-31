package cz.martin.logic.rooms;

public class EndRoom extends Room{
    public EndRoom() {
        super("Konec hry", "Zemrel jsi", "Hrat znovu", "", "", "random.jpg");
    }

    @Override
    public Room choose1() {
        return new Room2();
    }

    @Override
    public Room choose2() {
        return new Room3();
    }

    @Override
    public Room choose3() {
        return new Room4();
    }
}
