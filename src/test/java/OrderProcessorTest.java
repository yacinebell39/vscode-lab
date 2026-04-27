import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class OrderProcessorTest {

    @Test
    void testPrintOrderSummary_noDiscount() {
        // Non-member customer: no discount applied
        Customer customer = new Customer("Ali", false);
        List<Item> items = List.of(
                new Item("Book", 10.0, 2),   // 20.0
                new Item("Pen", 2.0, 5)       // 10.0
        );
        Order order = new Order(customer, items);
        OrderProcessor processor = new OrderProcessor();

        // Should run without exception, total = 30.0
        assertDoesNotThrow(() -> processor.printOrderSummary(order));
    }

    @Test
    void testPrintOrderSummary_withMemberDiscount() {
        // Member customer: 10% discount applied
        Customer customer = new Customer("Sara", true);
        List<Item> items = List.of(
                new Item("Laptop", 1000.0, 1) // 1000.0 -> after discount: 900.0
        );
        Order order = new Order(customer, items);
        OrderProcessor processor = new OrderProcessor();

        // Should run without exception
        assertDoesNotThrow(() -> processor.printOrderSummary(order));
    }

    @Test
    void testPrintOrderSummary_multipleItems() {
        Customer customer = new Customer("Karim", true);
        List<Item> items = List.of(
                new Item("Phone", 500.0, 2),  // 1000.0
                new Item("Case", 20.0, 3)      // 60.0
        );
        // total = 1060.0, after 10% discount = 954.0
        Order order = new Order(customer, items);
        OrderProcessor processor = new OrderProcessor();

        assertDoesNotThrow(() -> processor.printOrderSummary(order));
    }
}
