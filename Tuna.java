

public class Tuna extends Animal implements Sweemable{
   // private String colour;
    

    public Tuna(String name, int box) {
        super(name, box);
        //this.colour = colour;
    }

    @Override
    public String say() {
        return "Буль-буль-буль";
    }

    @Override
    public String toString() {
        return "Tuna" + super.toString();
    }

    @Override
    public int speedOfSweem() {
        // TODO Auto-generated method stub
        return 35;
    }




    
}
