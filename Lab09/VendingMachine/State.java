package Lab09.VendingMachine;

public interface State {

    void selectStation(String station);
    void insertCoin(int coin);
    void ticketOut();

}
