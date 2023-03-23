public class GroceryItemOrder {
    private String name;
    private double quantity = 1;
    private double pricePerUnit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public GroceryItemOrder(){

    }
    public GroceryItemOrder(String name,double pricePerUnit){
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }
    public double getCost(){
        return getPricePerUnit() * getQuantity();
    }

}
