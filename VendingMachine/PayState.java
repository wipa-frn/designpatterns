package VendingMachine;

public class PayState implements State {
    VendingMachine vendingMachine;

    public PayState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectStation(String station) {
        System.out.println("Sorry you can't change station. Please insert coin.");
    }

    @Override
    public void insertCoin(int coin) {

        System.out.println("You insert coin "+coin+" baht");

        if(vendingMachine.getTotalInsertCoin() == vendingMachine.getPrice()){

            vendingMachine.setState(vendingMachine.getEnd());
            System.out.println("Coin is enough.");
        }
        else if(vendingMachine.totalInsertCoin>vendingMachine.getPrice()){
            int change = vendingMachine.getTotalInsertCoin()-vendingMachine.getPrice();
            System.out.println("Coin is enough. And you have change "+change+" baht.");
            vendingMachine.setState(vendingMachine.getEnd());
        }
        else if(vendingMachine.totalInsertCoin<vendingMachine.getPrice()){
            System.out.println("Coin is not enough.");
        }

    }

    @Override
    public void ticketOut() {

        System.out.println("Please insert your coin");

    }


}
