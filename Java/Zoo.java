
import java.util.ArrayList;

public class Zoo{
    private ArrayList<Enclosure> enclosures;
    private ArrayList<Employee> employees;
    private String[][] zooMap = new String [5][5];
    private double dailyRevenue;

    public Zoo(ArrayList<Enclosure> enclosures, ArrayList<Employee> employees, String[][] zooMap){
        this.enclosures= enclosures;
        this.employees = employees;
        this.zooMap = zooMap;
    }


}