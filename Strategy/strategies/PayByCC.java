package Strategy.strategies;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PayByCC implements PayStrategy{

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;
    @Override
    public boolean pay(int paymentAmount) {
        if(cardIsPrerent()){
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            String number = READER.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("Enter the CVV code: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public boolean cardIsPrerent(){
        return card != null;
    }
}
