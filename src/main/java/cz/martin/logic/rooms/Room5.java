package cz.martin.logic.rooms;

public class Room5 extends Room{
    public Room5() {
        super("Room5", "Text5", "Button5-1", "Button5-2", "Button5-3", "room5.jpg");
    }

    @Override
    public Room choose1() {
        return new Room4();
    }

    @Override
    public Room choose2() {
        return new Room1();
    }

    @Override
    public Room choose3() {
        return new Room6();
    }
}
