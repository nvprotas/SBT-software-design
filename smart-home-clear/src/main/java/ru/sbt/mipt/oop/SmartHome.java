package ru.sbt.mipt.oop;

import java.util.ArrayList;
import java.util.Collection;

public class SmartHome implements HomeEntity {
    Collection<Room> rooms;

    public SmartHome() {
        rooms = new ArrayList<>();
    }

    public SmartHome(Collection<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Collection<Room> getRooms() {
        return rooms;
    }

    public void execute(SensorEvent event) {
        for (Room room : rooms) {
            room.execute(event);
        }
    }

}
