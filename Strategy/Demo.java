package Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import Strategy.order.Order;
import Strategy.strategies.PayByCC;
import Strategy.strategies.PayByPaypal;
import Strategy.strategies.PayStrategy;

public class Demo {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static{
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException{
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("Please, select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalAmount(cost * count);
                System.out.print("Do you wish to continue selecting products? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
                String paymentMethod = reader.readLine();

                // Client creates different strategies based on input from user,
                // application configuration, etc.
                if (paymentMethod.equals("1")) {
                    strategy = new PayByPaypal();
                } else {
                    strategy = new PayByCC();
                }
            }

            order.processOrder(strategy);
            System.out.print("Pay " + order.getTotalAmount() + " units or Continue shopping? P/C: ");
            String proceed = reader.readLine();
            if(proceed.equals("P")){
                // Finally, strategy handles the payment.
                if(strategy.pay(order.getTotalAmount())){
                    System.out.println("Payment has been successful.");
                }else {
                    System.out.println("FAIL! Please, check your data.");
                }
                order.setClosed();;
            }
        }
    }
}
