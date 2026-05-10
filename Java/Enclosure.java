import java.util.ArrayList;

public class Enclosure{
    private int id;
    private String name;
    private int capcity;
    private ArrayList<Animal> animals;

    public Enclosure(int id, String name, int capcity){
        this.id = id;
        this.name = name;
        this.capcity = capcity;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }

    public boolean isFull(){
        return capcity == animals.size();
    }

    public double totalDailyFood(){
        double ttFood=0;
        for(Animal i:animals){
            ttFood+=i.getDailyFoodkg();
        }
        return ttFood;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public ArrayList<Animal> getAnimals(){
        return animals;
    }




}