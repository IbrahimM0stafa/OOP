import java.util.ArrayList;

public class GroceryList {
    ArrayList<GroceryItemOrder> list1 = new ArrayList<>();;

    public GroceryList(){

    }
    public void add(GroceryItemOrder g1){
        if(list1.size() <= 10)
            list1.add(g1);
        else
            System.out.println("the list is full 0f orders");
    }
    public double getTotalCost(){
        double  sum = 0;
        for(int i = 0; i < list1.size(); i++)
            sum += list1.get(i).getCost();
        return sum;
    }
}
