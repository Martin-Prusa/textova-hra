package cz.martin.logic.rooms;

public class Room6 extends Room {
    public Room6() {
        super("Room6", "Text6", "Button6-1", "Button6-2", "Button6-3");
    }

    @Override
    public Room choose1() {
        return new Room2();
    }

    @Override
    public Room choose2() {
        return new Room1();
    }

    @Override
    public Room choose3() {
        return new Room3();
    }
}
