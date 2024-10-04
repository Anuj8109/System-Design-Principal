package Strategy.order;

import Strategy.strategies.PayStrategy;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy){
        strategy.collectPaymentDetails();
    }

    public void setTotalAmount(int cost){
        this.totalCost += cost;
    }

    public int getTotalAmount(){
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
