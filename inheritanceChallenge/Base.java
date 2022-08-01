public class Base {
    private String name;

    public Base(String name){
        setName(name);
    }

    public void moving(int speed){
        System.out.println("the vehicle moving speed : " + speed + " k/s.");
    }

    public void setName(String name) {
        this.name = name;
    }
}
