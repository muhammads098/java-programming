package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        // create traffic light object
        TrafficLight trafficLight=new TrafficLight();

        trafficLight.changeColor("red");
        trafficLight.showColor();
        trafficLight.changeColor("green");
        trafficLight.showColor();
        trafficLight.changeColor("yellow");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("grey");
        trafficLight2.showColor();


    }
}
