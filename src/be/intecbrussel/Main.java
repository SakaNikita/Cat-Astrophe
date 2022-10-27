package be.intecbrussel;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Felis felis = new Felis();
        Panthera panthera = new Panthera();
        Acinonyx acinonyx = new Acinonyx();
        NorwegianForestCat norwegianCat = new NorwegianForestCat();
        SiameseCat sc = new SiameseCat();
        PersianCat pc = new PersianCat();
        PersianCat pc1 = new PersianCat();
        TurkishVanCat turkishVCat = new TurkishVanCat();
        TurkishVanCat turkishVCat1 = new TurkishVanCat();
        AndeanMountainCat andeanMCat = new AndeanMountainCat();

        Felis[]Cats = {norwegianCat, sc, pc, pc1, turkishVCat, turkishVCat1, andeanMCat};

        for (Felis flx : Cats){
            System.out.println(flx);
        }

        System.out.println(pc.hashCode());
        System.out.println(andeanMCat.equals(sc));
        System.out.println(sc.equals(pc));

    }
}