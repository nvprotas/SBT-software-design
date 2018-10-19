package ru.sbt.mipt.oop;

public class HomeEventsObserver {
    public static void observe(SmartHome smartHome){
        SensorEvent event = RandomSensorEventProvider.getNextSensorEvent();
        while (event != null) {
            System.out.println("Got event: " + event);
            smartHome.execute(event);
            event = RandomSensorEventProvider.getNextSensorEvent();
        }
    }
}
