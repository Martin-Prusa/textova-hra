package cz.martin.data;

import com.google.gson.Gson;
import cz.martin.logic.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    public void saveRooms(ArrayList<Room> rooms) {
        try {
            Room[] roomsArr = new Room[rooms.size()];
            for (int i = 0; i < rooms.size(); i++) {
                roomsArr[i] = new Room(rooms.get(i).getName(), rooms.get(i).getText(), rooms.get(i).getButtonTexts()[0], rooms.get(i).getButtonTexts()[1], rooms.get(i).getButtonTexts()[2], rooms.get(i).getImg());
                roomsArr[i].setRooms(new Room(rooms.get(i).choose1().getName(), null, null, null, null, null), new Room(rooms.get(i).choose2().getName(), null, null, null, null, null), new Room(rooms.get(i).choose3().getName(), null, null, null, null, null));
            }
            Gson gson = new Gson();
            String json = gson.toJson(roomsArr);
            BufferedWriter bw = new BufferedWriter(new FileWriter("save.json"));
            bw.write(json);
            bw.close();
        } catch (IOException ignored) {}
    }

    public ArrayList<Room> readRooms() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("save.json"));
            Gson gson = new Gson();
            Room[] rooms = gson.fromJson(br.readLine(), Room[].class);
            ArrayList<Room> roomsList = new ArrayList<>(Arrays.asList(rooms));
            br.close();
            return roomsList;
        } catch (IOException ignored) {}
        return new ArrayList<>();
    }
}