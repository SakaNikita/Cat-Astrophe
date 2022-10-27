package be.intecbrussel;

public class AndeanMountainCat extends Felis{

    private String customSound;

    public boolean isAlive(){
        System.out.println("Miauw!");
        return false;
    }

    @Override
    public String toString() {
        return "AndeanMountainCat{" +
                "customSound='" + customSound + '\'' +
                '}';
    }
}
