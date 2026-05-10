public class Snake extends Animal{
    public Snake(String name, int age, double weight, String species, int enclosureId){
        super(name, age, weight, species, enclosureId);
    }
    @Override
    public String makeSound(){
        return "HISS";
    }
    @Override
    public double getDailyFoodkg(){
        return 0.5;
    }
}