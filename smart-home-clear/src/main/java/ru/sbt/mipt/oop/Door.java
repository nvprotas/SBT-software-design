package ru.sbt.mipt.oop;

import static ru.sbt.mipt.oop.SensorEventType.DOOR_CLOSE;
import static ru.sbt.mipt.oop.SensorEventType.DOOR_OPEN;

public class Door implements HomeEntity {
    private boolean isOpen;
    private final String id;

    public Door(boolean isOpen, String id) {
        this.id = id;
        this.isOpen = isOpen;
    }

    public String getId() {
        return id;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public void execute(SensorEvent event) {
        if (this.id.equals(event.getObjectId())) {
            if (event.getType() == DOOR_OPEN) {
                this.setOpen(true);
                System.out.println("Door " + this.getId() +  " was opened.");
            }
            if (event.getType() == DOOR_CLOSE){
                this.setOpen(false);
                System.out.println("Door " + this.getId() +  " was closed.");
            }
        }
    }
}
