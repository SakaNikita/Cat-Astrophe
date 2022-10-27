package be.intecbrussel;

public class Acinonyx extends Animal{

    private double speed = 20;
    private double distance;

    @Override
    public String makeNoise(){
        System.out.println("Kiaauuw!");
        return null;
    }

    @Override
    public String toString() {
        return "Acinonyx{" +
                "speed=" + speed +
                ", distance=" + distance +
                '}';
    }
}
