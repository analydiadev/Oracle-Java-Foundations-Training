package duck.choice;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;
        int measurement = 3;
        Costumer costumer1 = new Costumer();
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2};

        items[0].setDescription("Blue Jacket");
        items[0].setPrice(20.9);
        items[0].setSize("S");

        items[1].setDescription("Orange T-Shirt");
        items[1].setPrice(10.5);
        items[1].setSize("S");

        costumer1.setName("Pinky");
        costumer1.setSize(measurement);

        String details = String.format("\nItem: %s,  Price: %s",
                items[0].getDescription(),
                items[0].getPrice());
        System.out.println("Costumer:" + costumer1.getName() + details);

        for (Clothing item : items) {
            total = total + item.getPrice();
            if (costumer1.getSize().equals(item.getSize())) {
                total += total * tax;
                if (total > 15) {
                    break;
                }
            }
        }
        System.out.println("Total: " + total);
    }
}


