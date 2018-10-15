package TourProgram;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SingleTourTest {

    Tour t1,t2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        t1 = new SingleTour("WatPraKaew",200,20,8);
        t2 = new SingleTour("TaladNam",250,20,10);
    }

    @org.junit.jupiter.api.Test
    void testGetName() {
        assertEquals("WatPraKaew",t1.getName());
        assertEquals("TaladNam",t2.getName());

    }

    @org.junit.jupiter.api.Test
    void testGetPrice() {
        assertEquals(200,t1.getPrice());
        assertEquals(250,t2.getPrice());
    }

    @org.junit.jupiter.api.Test
    void testAvailableSeatsIsNotEnough() {
        t1 = new SingleTour("WatPraKaew",200,20,20);
        t2 = new SingleTour("TaladNam",250,30,30);
        assertEquals(0,t1.getAvailableSeats());
        assertEquals(0,t2.getAvailableSeats());
    }
}