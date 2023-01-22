
public class Cat extends Animal implements Runable{
    String colour;
    

    public Cat(String name, int box, String colour) {
        super(name, box);
        this.colour = colour;
    }

    @Override
    public String say() {
        return "Мяу";
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }

    @Override
    public int speedOfRun() {
        // TODO Auto-generated method stub
        return 15;
    }




    
}
