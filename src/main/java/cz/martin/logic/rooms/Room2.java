package cz.martin.logic.rooms;

public class Room2 extends Room{
    public Room2() {
        super("Room2", "Text2", "Button2-1", "Button2-2", "Button2-3", "room2.jpg");
    }

    @Override
    public Room choose1() {
        return new Room5();
    }

    @Override
    public Room choose2() {
        return new Room6();
    }

    @Override
    public Room choose3() {
        return new Room1();
    }
}
