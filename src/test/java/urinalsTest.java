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
    @Test
    void getString(){
        String expected = "====== Manmeet Singh == TEST TWO EXECUTED =======";
        String actual = urinals.getString();
        assertEquals(expected, actual,"Test Case executed");
    }


}