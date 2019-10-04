package mylists;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MyArrayListTest {

    private MyArrayList<Integer> list = new MyArrayList<>();

    @Before
    public void setUp() {
        Arrays.asList(10, 3, 7, 5, 8, 6).forEach(element -> list.add(element));
    }

    @Test
    public void shouldReturnTen() {
        assertEquals(new Integer(10), list.get(0));
    }

    @Test
    public void testAddMehtod() {
        int previousSize = list.size();
        list.add(55);
        assertEquals(new Integer(55), list.get(previousSize));
        assertEquals(7, previousSize + 1);
    }


    @Test
    public void testAddWithIndex() {
        list.add(3, 99);
        assertEquals(new Integer(99), list.get(3));
    }

    @Test
    public void shouldReturnSizeSix() {
        assertEquals(6, list.size());
    }
}