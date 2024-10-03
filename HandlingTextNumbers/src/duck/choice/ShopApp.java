package duck.choice;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        int measurement = 3;
        Costumer costumer1 = new Costumer();
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2};

        costumer1.name = "Pinky";
        costumer1.size = "S";
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";


        double total = (item1.price + item2.price * 2) * (1 + tax);
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                costumer1.size = "S";
                break;
            case 4:
            case 5:
            case 6:
                costumer1.size = "M";
                break;
            case 7:
            case 8:
            case 9:
                costumer1.size = "L";
                break;
            default:
        }

        for (Clothing item : items) {
            if (costumer1.size.equals(item.size)) {
                total += item.price;
                System.out.println("Total: " + total);
            }
        }
    }
}

