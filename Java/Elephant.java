public class Elephant extends Aniaml{
    public Elephant(String name, int age, double weight,String species,int enclosureId){
        super(name, age, weight, species, enclosureId);
    }
    @Override
    public String makeSound(){
        return "TRUMPET";
    }

    @Override
    public double getDailyFoodkg(){
        return 150.0;
    }
}