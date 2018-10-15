package TourProgram;

import java.util.ArrayList;
import java.util.List;

public class MainTour {
    public static void main(String[] args) {
        List<Tour> tours = new ArrayList<>();
        Tour t1 = new SingleTour("WatPraKaew",200,20,8);
        Tour t2 = new SingleTour("TaladNam",250,20,10);
        tours.add(t1);
        tours.add(t2);
        System.out.println(t1.getName());
        Tour packageTour = new PackageTour("Temple & Market)",tours);
    }
}
