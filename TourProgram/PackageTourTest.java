package TourProgram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class PackageTourTest {

    List<Tour> tours = new ArrayList<>();
    Tour t1,t2,packageTour;

    @BeforeEach
    void setUp() {
        t1 = new SingleTour("WatPraKaew",200,20,8);
        t2 = new SingleTour("TaladNam",250,20,10);
        tours.add(t1);
        tours.add(t2);
        packageTour = new PackageTour("Temple & Market",tours);
    }

    @Test
    void testGetName() {
        assertEquals("Temple & Market",packageTour.getName());
    }

    @Test
    void testGetPrice() {
        assertEquals(405,packageTour.getPrice());
    }

    @Test
    void testGetAvailableSeats() {
        assertEquals(10,packageTour.getAvailableSeats());
    }
    @Test
    void testAvailableSeatsIsNotEnough() {
        t1 = new SingleTour("WatPraKaew",200,20,20);
        t2 = new SingleTour("TaladNam",250,30,15);
        tours.add(t1);
        tours.add(t2);
        assertEquals(0,packageTour.getAvailableSeats());
    }
}