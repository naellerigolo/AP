public class Penguin extends Animal{
    public  Penguin(String name, int age,int weight, String species, int enclosureId){
        super(name, age, weight, species, enclosureId);
    }
    @Override
    public String makeSound(){
        return "SQUAWK";
    }
    @Override
    public double getDailyFoodkg(){
        return 2.0;
    }
}