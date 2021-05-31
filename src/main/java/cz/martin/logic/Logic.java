package cz.martin.logic;


import cz.martin.logic.rooms.Room;
import cz.martin.logic.rooms.Room1;

public class Logic {
    private Room actualRoom;

    public Logic() {
        this.actualRoom = new Room1();
    }

    public Room getActualRoom() {
        return actualRoom;
    }

    public void setActualRoom(Room actualRoom) {
        this.actualRoom = actualRoom;
    }
}
