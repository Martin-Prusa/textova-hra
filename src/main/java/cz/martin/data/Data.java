package cz.martin.data;

import com.google.gson.Gson;
import cz.martin.logic.rooms.Room;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Data {
    public void saveRoom(Room room, boolean append) {
        try {
            Room r2 = new Room(room.getName(), room.getText(), room.getButtonText1(),room.getButtonText2(), room.getButtonText3(), room.getImg());
            Gson gson = new Gson();
            String json = gson.toJson(r2);
            BufferedWriter bw = new BufferedWriter(new FileWriter("save.json", append));
            bw.write(json);
            bw.close();
        } catch (IOException ignored) {
            System.out.println("Chyba");
        }
    }
}