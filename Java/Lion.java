public class Lion extends Animal{
   public Lion(String name, int age, double weight, String species, int enclosureId){
    super(name, age, weight, species, enclosureId);
   }
   @Override
   public String makeSound(){
    return "ROAR";
   }
   @Override
   public double getDailyFoodkg(){
    return 9.0;
   }
}