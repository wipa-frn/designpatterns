package Lab09.VendingMachine;

public class ReadyState implements State {
    VendingMachine vendingMachine;
    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectStation(String station) {
        //calculate price and show on display
        if (station!=null) {
            System.out.print("From station: " + vendingMachine.getCurrentStation() + " to " + vendingMachine.getTargetStaion());
            System.out.println(" price " + vendingMachine.calPrice() + " baht.");
            vendingMachine.setState(vendingMachine.getPay());
        }
    }

    @Override
    public void insertCoin(int coint) {
        System.out.println("Please select station before insert coin.");
    }

    @Override
    public void ticketOut() {
        System.out.println("You can't get a ticket. Please select station and insert coin.");
    }



}
