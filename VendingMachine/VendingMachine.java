package VendingMachine;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class VendingMachine {


    ArrayList<String> stationName = new ArrayList<>();
    String currentStation;
    String targetStaion;
    int price;
    int totalInsertCoin;

    State ready;
    State pay;
    State end;
    State state;

    public VendingMachine(ArrayList<String> stationName,String currentStation) {
        this.stationName = stationName;
        this.currentStation = currentStation;
        ready = new ReadyState(this);
        pay = new PayState(this);
        end = new EndState(this);
        this.state = ready;
    }

    public void selectStation(String station){
        this.setTargetStaion(station);
        this.state.selectStation(station);
    }
    public void insertCoin(int coin){
        this.totalInsertCoin += coin;
        this.state.insertCoin(coin);
    }
    public void ticketOut(){
        this.state.ticketOut();
    }

    public ArrayList<String> getStationName() {
        return stationName;
    }

    public void setStationName(ArrayList<String> station) {
        this.stationName = station;
    }

    public String getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(String currentStation) {
        this.currentStation = currentStation;
    }

    public String getTargetStaion() {
        return targetStaion;
    }

    public void setTargetStaion(String selectStaion) {
        this.targetStaion = selectStaion;
    }

    public State getReady() {
        return ready;
    }

    public void setReady(State ready) {
        this.ready = ready;
    }

    public State getPay() {
        return pay;
    }

    public void setPay(State pay) {
        this.pay = pay;
    }

    public State getEnd() {
        return end;
    }

    public void setEnd(State end) {
        this.end = end;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalInsertCoin() {
        return totalInsertCoin;
    }

    public void setTotalInsertCoin(int totalInsertCoin) {
        this.totalInsertCoin = totalInsertCoin;
    }

    public int calPrice(){
        price = 15* Math.abs(stationName.indexOf(currentStation)-stationName.indexOf(targetStaion));
        return price;
    }
}

