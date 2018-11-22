package e02Sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    List<Integer> list;

    @BeforeEach
    void before() {
    //        Sum.sum(Arrays.asList(1, 2, 3, 4));

    //        List<Integer> list = new ArrayList<>();
    //        list.add(1);
    //        list.add(2);
    //        list.add(3);
    //        list.add(4);

           list = Arrays.asList(1, 2, 3, 4);

    }


    @Test
    void testSum() {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4);
//        Sum.sum(Arrays.asList(1, 2, 3, 4));
        assertEquals(10, Sum.sum(list));
    }
}