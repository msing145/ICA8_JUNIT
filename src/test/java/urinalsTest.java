import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {


    urinals urinals = new urinals();

    @Test
    void countUrinal() {

        System.out.println("====== Manmeet Singh == TEST TWO EXECUTED =======");
        int expected  = 1;
        int actual = urinals.countUrinals("10001");


        assertEquals(expected, actual, "Test case executed");

    }


}