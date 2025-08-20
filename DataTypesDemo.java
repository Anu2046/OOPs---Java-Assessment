public class DataTypesDemo {
   
    enum ProductCategory {ELECTRONICS, CLOTHING, GROCERIES}

    public static void main(String[] args) {
        
        byte age = 30;
        short productCode = 1234;
        int quantity = 100;
        long productId = 9876543210L;
        float price = 29.99f;
        double discount = 15.5;
        boolean inStock = true;
        char qualityGrade = 'A';

       
        String productName = "Wireless Headphones";
        String[] features = {"Bluetooth", "Noise Cancelling", "20hr Battery"};
        ProductCategory category = ProductCategory.ELECTRONICS;
        Object productDetails = "Latest model with premium sound";
        Integer warrantyYears = 2;  // Wrapper class

        
        System.out.println("=== Product Information ===");
        System.out.println("Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("In Stock: " + (inStock ? "Yes" : "No"));
        System.out.println("Quality Grade: " + qualityGrade);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Features: " + String.join(", ", features));
        System.out.println("Product ID: " + productId);
        System.out.println("Age Recommendation: " + age + "+");
        System.out.println("Product Code: " + productCode);
        System.out.println("Available Quantity: " + quantity);
        System.out.println("Details: " + productDetails);
    }
}
