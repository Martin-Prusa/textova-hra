package cz.martin.logic.rooms;

public class Room3 extends Room{
    public Room3() {
        super("Room3", "Text3", "Button3-1", "Button3-2", "Button3-3");
    }

    @Override
    public Room choose1() {
        return new Room1();
    }

    @Override
    public Room choose2() {
        return new Room5();
    }

    @Override
    public Room choose3() {
        return new Room4();
    }
}
