public class Main {
    public static void main(String[] args) {

        GroceryItemOrder order1 = new GroceryItemOrder("water", 15);
        GroceryItemOrder order2 = new GroceryItemOrder("noodles", 6);
        GroceryItemOrder order3 = new GroceryItemOrder("pepsi", 4);
        GroceryItemOrder order4 = new GroceryItemOrder("chips", 8);
        GroceryItemOrder order5 = new GroceryItemOrder("cheese", 10);

        GroceryList list1 = new GroceryList();

        list1.add(order1);
        list1.add(order2);
        list1.add(order3);
        list1.add(order4);
        list1.add(order5);

        order1.setQuantity(2);
        order2.setQuantity(3);
        order3.setQuantity(1);
        order4.setQuantity(4);
        order5.setQuantity(5);

        System.out.println(order1.getCost());
        System.out.println(order2.getCost());
        System.out.println(order3.getCost());
        System.out.println(order4.getCost());
        System.out.println(order5.getCost());

        System.out.println(list1.getTotalCost());
    }
    }
