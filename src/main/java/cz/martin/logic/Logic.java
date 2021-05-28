package cz.martin.logic;


import cz.martin.logic.rooms.Room;

public class Logic {
    private Room actualRoom;

    public Logic() {

    }

    public Room getActualRoom() {
        return actualRoom;
    }

    public void setActualRoom(Room actualRoom) {
        this.actualRoom = actualRoom;
    }
}
