package ru.sbt.mipt.oop;

import java.util.Collection;

public class Room implements HomeEntity {
    private Collection<Light> lights;
    private Collection<Door> doors;
    private Collection<Room> innerRoom;
    private String name;

    public Room(Collection<Light> lights, Collection<Door> doors, String name) {
        this.lights = lights;
        this.doors = doors;
        this.name = name;
        this.innerRoom = null;
    }

    public Room(Collection<Room> innerRoom, Collection<Light> lights, Collection<Door> doors, String name) {
        this.lights = lights;
        this.doors = doors;
        this.name = name;
        this.innerRoom = innerRoom;
    }

    public Collection<Light> getLights() {
        return lights;
    }

    public Collection<Door> getDoors() {
        return doors;
    }

    public String getName() {
        return name;
    }

    public Light getLightById(String objectId) {
        return null;
    }

    @Override
    public void execute(SensorEvent event) {
//        System.out.println("Executing in room");

        for (Door door : doors) {
            door.execute(event);
        }

        for (Light light : lights) {
            light.execute(event);
        }

        if (innerRoom != null) {
            for (Room room : innerRoom) {
                room.execute(event);
            }
        }
    }
}
