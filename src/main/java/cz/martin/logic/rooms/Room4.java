package cz.martin.logic.rooms;

public class Room4 extends Room{
    public Room4() {
        super("Room4", "Text4", "Button4-1", "Button4-2", "Button4-3");
    }

    @Override
    public Room choose1() {
        return new Room6();
    }

    @Override
    public Room choose2() {
        return new Room5();
    }

    @Override
    public Room choose3() {
        return new Room2();
    }
}
