package be.intecbrussel;

import java.util.Objects;

public class Animal {

    //Properties
    private char size;
    private char coat;
    private String color;
    private double weight;

    private static int animalCount;
    {
        animalCount++;
    }

    //Constructor
    public Animal(){
    }


    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return animalCount;
    }

    public static void setCount(int count) {
        Animal.animalCount = count;
    }

    public String makeNoise(){
        System.out.println("Miaoouu!");
        return null;
    }

    public void eat(){
        System.out.println("Eat fish");
    }

    public void sleep(){
        System.out.println("Sleep anytime");
    }
    public boolean isAlive(){
        System.out.println("Miaoouu!");
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return size == animal.size && coat == animal.coat && Double.compare(animal.weight, weight) == 0 && color.equals(animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, coat, color, weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", coat=" + coat +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
