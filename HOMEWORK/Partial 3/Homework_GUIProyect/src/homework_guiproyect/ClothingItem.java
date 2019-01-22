package homework_guiproyect;

/**
 * @author Sebastian Landazuri G.
 */

public class ClothingItem
{
    private float price;
    private int size;
    private int color;
    private int gender;
    private String type;
    private int quantity;
    /**
     * Method contructor that receives all the parameters that the class ClothingItem needs
     * @param type String receives the clothing type
     * @param price float receives the clothing's price 
     * @param size int receives the clothing's size 
     * @param color int receives the clothing's color
     * @param gender int receives the clothing's gender
     * @param quantity int receives the clothing's quantity
     */
    public ClothingItem(String type, float price, int size, int color, int gender,int quantity) {
        this.price = price;
        this.size = size;
        this.color = color;
        this.gender = gender;
        //this.type=type;
        this.quantity=quantity;
    }
   
    
    /**
     * Method that verify if the clothing's characteristics are equals
     * @param obj Object allows compare the parameters with the getters that obj 
     * @return the equality of parameters between the obj object and the class ClothingItem
     */
  
    
    
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int clothesSize) {
        this.size = clothesSize;
    }    

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
 
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
         

}
