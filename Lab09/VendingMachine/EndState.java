package Lab09.VendingMachine;

public class EndState implements State {
    VendingMachine vendingMachine;

    public EndState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectStation(String station) {
        System.out.println("You can't change station.");
    }

    @Override
    public void insertCoin(int coin) {   System.out.println("Coin is enough. And you have change "+coin+" baht.");
    }

    @Override
    public void ticketOut() {
        System.out.println("This's your ticket. Thank you");
        vendingMachine.setState(vendingMachine.getReady());
        vendingMachine.setTotalInsertCoin(0);

    }
}
