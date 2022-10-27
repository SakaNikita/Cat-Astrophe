package be.intecbrussel;

public class Panthera extends Animal{

    private String roar;
    private boolean hunt;
    private static int count;
    {
        count++;
    }

    public Panthera(){
    }

    public Panthera(String roar, boolean hunt) {
        this.roar = roar;
        this.hunt = hunt;
    }

    public String getRoar() {
        return roar;
    }

    public void setRoar(String roar) {
        this.roar = roar;
    }

    public boolean isHunt() {
        return hunt;
    }

    public void setHunt(boolean hunt) {
        this.hunt = hunt;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Panthera.count = count;
    }

    @Override
    public String makeNoise(){
        System.out.println("Miaouuu!");
        return null;
    }


    //@Override
   // public boolean equals(Object obj) {
    //    if (this == obj) return true;
     //   if (!(obj instanceof Panthera)) return false;
     //   Panthera panthera = (Panthera) obj;
     //   return Object.equals(color, panthera.color);
    //}

   // @Override
   // public int hashCode() {
    //    return Object.hashCode(color);
    //}


    @Override
    public String toString() {
        return "Panthera{" +
                "roar='" + roar + '\'' +
                ", hunt=" + hunt +
                '}';
    }
}
