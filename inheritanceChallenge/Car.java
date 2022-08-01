public class Car extends Base {
    private String color;
    private int gearState;
    private int speed;

    public Car(String name, String color, int gearState ,int speed){
        super(name);
        this.color = color;
        this.gearState = gearState;
        this.speed = speed;
    }

    public void gearsIncrease(){
        setGearState(gearState + 1);
        System.out.println(" the gear is  " + getGearState());
        setSpeed(speed + 6);
        moving(speed);
    }
    public void gearsDecrease(){
        setGearState(gearState - 1);
        System.out.println(" the gear is  " + getGearState());
        setSpeed(speed - 6);
        moving(speed);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGearState(int gearState) {
        this.gearState = gearState;
    }

    public int getGearState() {
        return gearState;
    }



}
