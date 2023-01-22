

public class Duck  extends Animal implements Runable, Flyable{

    public Duck(String name, int box) {
        super(name, box);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String say() {
        return "Кря-кря";
    }

    @Override
    public int speedOfFly() {
        // TODO Auto-generated method stub
        return 40;
    }

    @Override
    public int speedOfRun() {
        // TODO Auto-generated method stub
        return 10;
    }
    
    
}
