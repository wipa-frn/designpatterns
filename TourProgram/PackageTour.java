package TourProgram;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();

    public PackageTour(String packageName, List<Tour> tours) {
        this.packageName = packageName;
        this.tours = tours;
    }

    @Override
    public String getName() {
        return packageName;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t : tours)
            total += t.getPrice();
        return total*0.9;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public int getAvailableSeats() {
        int seat = tours.get(0).getAvailableSeats();
        if(!tours.isEmpty()){
            for (Tour t : tours ) {
                if((t.getAvailableSeats() < seat ))
                    seat = t.getAvailableSeats();
            }
        }
        return seat;
    }
}
