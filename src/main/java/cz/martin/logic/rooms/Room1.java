package cz.martin.logic.rooms;

public class Room1 extends Room{
    public Room1() {
        super("Room1", "Text1", "Button1-1", "Button1-2", "Button1-3", "room1.jpg");
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
