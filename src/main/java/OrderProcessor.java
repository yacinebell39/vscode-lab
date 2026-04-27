/**
 * OrderProcessor class - AFTER Refactoring (Extract Method)
 *
 * Before refactoring:
 *   - All logic was inside one big method: printOrderSummary()
 *
 * After refactoring (Extract Method):
 *   - calculateTotalPrice()  -> extracted to calculate total
 *   - applyDiscount()        -> extracted to apply member discount
 *   - printSummary()         -> extracted to print the result
 */
public class OrderProcessor {

    public void printOrderSummary(Order order) {
        double totalPrice = calculateTotalPrice(order);
        totalPrice = applyDiscount(order, totalPrice);
        printSummary(order, totalPrice);
    }

    private double calculateTotalPrice(Order order) {
        double totalPrice = 0;
        for (Item item : order.getItems()) {
            totalPrice += item.getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    private double applyDiscount(Order order, double totalPrice) {
        if (order.getCustomer().isMember()) {
            totalPrice *= 0.9; // 10% discount for members
        }
        return totalPrice;
    }

    private void printSummary(Order order, double totalPrice) {
        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Items:");
        for (Item item : order.getItems()) {
            System.out.println("  - " + item.getName() + ": "
                    + item.getQuantity() + " x $" + item.getPrice()
                    + " = $" + (item.getQuantity() * item.getPrice()));
        }
        System.out.printf("Total Price: $%.2f%n", totalPrice);
    }
}
