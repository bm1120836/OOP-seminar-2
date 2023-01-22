

public class Horse extends Animal implements Runable {
    private String colour;

    public Horse(String name, int box, String color) {
        super(name, box);
        this.colour = colour;
    }

    @Override
    public String say() {
        return "Игого";
    }

    @Override
    public String toString() {
        return "Horse" + super.toString();
    }

    @Override
    public int speedOfRun() {
        // TODO Auto-generated method stub
        return 50;
    }




    
}
