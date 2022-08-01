public class Animal {
    private String name;
    private int brain;
    private int weight;
    private int size;
    private int body;

    public Animal(String name , int brain, int weight, int size, int body){
        this.name = name;
        this.brain = brain;
        this.weight = weight;
        this.size = size;
        this.body = body;
    }

    public void eat(){
        System.out.println("Animal.eat()");
    }
    
    public void move(int speed) {
        System.out.println("Animal.move is called at " + speed + " speed");
    }

    public String getName(){
        return this.name;
    }

    public int getBrain(){
        return this.brain;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getSize(){
        return this.size;
    }
    public int getBody(){
        return this.body;
    }


}
