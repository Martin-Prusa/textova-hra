package cz.martin.logic.rooms;

public class WinRoom extends Room{
    public WinRoom() {
        super("Konec hry", "Vyhral jsi", "Hrat znovu", "", "", "random.jpg");
    }

    @Override
    public Room choose1() {
        return new Room1();
    }
}