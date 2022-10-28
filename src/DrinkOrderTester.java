
public class DrinkOrderTester {
    public static void main(String[] args)
    {
        //Create DrinkOrder object and set attributes
        DrinkOrder d = new DrinkOrder();
        d.name = "Avocado Latte + Sprinkles";
        d.price = 3.00;
        d.quantity = 3;
        
        System.out.println("Subtotal: "+ d.getSubtotal()); //Displays the order total before tax
        System.out.println("6% Tax: " + d.getSalesTax()); //Displays the subtotal * .06
        
        System.out.println(d);  //Displays the whole order as shown in sample output
    }
        
}
