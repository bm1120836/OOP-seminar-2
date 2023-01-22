
public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Pushka", 1, "gray"))
        .addAnimal(new Horse("Igo", 10, "Blond"))
        .addAnimal(new Duck("Donald", 7))
        .addAnimal(new Tuna("Yello Submarin", 9));

        for (Animal an: zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.say());
        }
        System.out.println("------------");
        System.out.println("Sounds in the Zoo");
        System.out.println("------------");
        for (Speakable speak : zoo1.getSpeakables()) {
            System.out.println(speak.say());
        }
 
        for (Runable runner : zoo1.getRunner()) {
            System.out.println("Speed is : " + runner.speedOfRun());
        }
        
        int max = zoo1.getChampionOfRunners();
        System.out.println(String.format("Max of speed in the zoo is %d", max));

        System.out.println("------------");

        for (Flyable flyer : zoo1.getFlyers()) {
            System.out.printf("Speed of fly : %d", flyer.speedOfFly());
        }

        System.out.println();

        for (Sweemable sweemmer : zoo1.getSweemmers()) {
            System.out.printf("Speed of sweem : %d", sweemmer.speedOfSweem());
        }


         
    }
    
}
