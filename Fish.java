import java.lang.reflect.Constructor;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name , int weight, int size, int gills, int eyes, int fins ){
        super(name, 1, weight, size, 1);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
}
