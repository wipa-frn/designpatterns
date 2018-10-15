package VendingMachine;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> stationName = new ArrayList<String>();
        stationName.add("National Stadium");
        stationName.add("Siam");
        stationName.add("Sala Daeng");
        stationName.add("Chong Nonsi");
        stationName.add("Surasak");
        stationName.add("Sapan Taksin");
        stationName.add("Krung Thonburi");
        stationName.add("Wongwian Yai");
        stationName.add("Pho Nimit");
        stationName.add("Talat Phlu");
        stationName.add("Wutthakat");
        stationName.add("Bang Wa");

        VendingMachine vendingMachine = new VendingMachine(stationName,"Siam");

        vendingMachine.selectStation("Krung Thonburi");
        vendingMachine.insertCoin(10);
        vendingMachine.ticketOut();
        vendingMachine.selectStation("Bang Wa");
        vendingMachine.ticketOut();
        vendingMachine.insertCoin(10);
        vendingMachine.insertCoin(70);
        vendingMachine.ticketOut();







    }
}
