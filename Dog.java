public class Dog extends Animal {
    
    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    
    public Dog(String name , int weight, int size, int eyes, int legs, int teeth, int tail){
        super(name, 1 , weight, size, 1);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
    }   

    public void chew(){
        System.out.println("Dog.chew()");
    }

    // Override
    public void eat() {
        System.out.println("Dog.eat()");
        chew();
        super.eat();
    }

    private void moveLeg(int speed){
        System.out.println("move leg at " + speed);
    }

    public void walk(){
        System.out.println("when dog.walk() called");
        moveLeg(4);
        move(10);
    }

    public void run(){
        System.out.println("when dog.run() called");
        move(20);
    }
    
    //override
    public void move(int speed) {
        System.out.println("Dog move called at " + speed + " speed");
        super.move(speed / 2);
    }

}
