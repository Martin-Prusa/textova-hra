package cz.martin.logic;


import cz.martin.data.Data;

import java.util.ArrayList;

public class Logic {
    private Room actualRoom;
    private ArrayList<Room> rooms;
    private Data data;
    private InventoryItem[] inventory;

    public Logic() {
        this.data = new Data();
        //this.rooms = data.readRooms();
        this.rooms = new ArrayList<>();
        this.inventory = new InventoryItem[3];

//        for (Room room : rooms) {
//            for (Room room1 : rooms) {
//                if(room.choose1().getName().equalsIgnoreCase(room1.getName())) room.setR1(room1);
//                if(room.choose2().getName().equalsIgnoreCase(room1.getName())) room.setR2(room1);
//                if(room.choose3().getName().equalsIgnoreCase(room1.getName())) room.setR3(room1);
//            }
//        }

        //----------------------------New Rooms--------------------------------------------
        rooms.add(new Room("Room1", "Text1", "Button1-1", "Button1-2", "Button1-3", "room1.jpg"));
        rooms.add(new Room("Room2", "Text2", "Button2-1", "Button2-2", "Button2-3", "room2.jpg"));
        rooms.add(new Room("Room3", "Text3", "Button3-1", "Button3-2", "Button3-3", "room3.jpg"));
        rooms.add(new Room("Room4", "Text4", "Button4-1", "Button4-2", "Button4-3", "room4.jpg"));
        rooms.add(new Room("Room5", "Text5", "Button5-1", "Button5-2", "Button5-3", "room5.jpg"));
        rooms.add(new Room("Room6", "Text6", "Button6-1", "Button6-2", "Button6-3", "room6.jpg"));
        rooms.add(new Room("Vyhral jsi", "Vyhral jsi", "Hrat znovu", "", "", "random.jpg"));
        rooms.add(new Room("Konec hry", "Zemrel jsi", "Hrat znovu", "", "", "random.jpg"));
        //set rooms
        rooms.get(0).setRooms(rooms.get(1), rooms.get(2), rooms.get(3));
        rooms.get(1).setRooms(rooms.get(4), rooms.get(5), rooms.get(0));
        rooms.get(2).setRooms(rooms.get(0), rooms.get(4), rooms.get(3));
        rooms.get(3).setRooms(rooms.get(5), rooms.get(4), rooms.get(1));
        rooms.get(4).setRooms(rooms.get(3), rooms.get(0), rooms.get(5));
        rooms.get(5).setRooms(rooms.get(6), rooms.get(0), rooms.get(7));
        rooms.get(6).setRooms(rooms.get(0), rooms.get(7), rooms.get(7));
        rooms.get(7).setRooms(rooms.get(0), rooms.get(7), rooms.get(7));
        //set inventoty item
        rooms.get(1).setItem(new InventoryItem("item0", "Item 0"));
        rooms.get(4).setItem(new InventoryItem("item1", "Item 1"));

        rooms.get(5).setRequiredItemId("item0");
        //set actualRoot
        this.actualRoom = this.rooms.get(0);
    }

    public Room getActualRoom() {
        return actualRoom;
    }

    public void setActualRoom(Room actualRoom) {
        this.actualRoom = actualRoom;
        if(this.actualRoom.getItem() != null) {
            for (int i = 0; i < this.inventory.length; i++) {
                if(this.inventory[i] != null && inventory[i].getId().equals(this.actualRoom.getItem().getId())) this.inventory[i] = null;
                if(this.inventory[i] == null) {
                    this.inventory[i] = this.actualRoom.getItem();
                    return;
                }
            }
        }
    }

    public void save() {
        this.data.saveRooms(this.rooms);
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public boolean canEnterRoom(Room r) {
        if(r.getRequiredItemId() == null) return true;
        for (InventoryItem inventoryItem : inventory) {
            if(inventoryItem != null && r.getRequiredItemId().equals(inventoryItem.getId())) return true;
        }
        return false;
    }

    public void removeFromInventory(String itemId) {
        if(itemId == null) return;
        for (int i = 0; i < this.inventory.length; i++) {
            if(this.inventory[i] == null) continue;
            if(this.inventory[i].getId().equals(itemId)) this.inventory[i] = null;
        }
    }
}