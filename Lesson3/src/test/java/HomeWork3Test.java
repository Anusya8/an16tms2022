import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork3Test {
    @org.junit.jupiter.api.Test
    void sum() {
        Assertions.assertEquals(HomeWork.sum (1,2),3);
        Assertions.assertEquals(HomeWork.sum (0,-2),-2);
        Assertions.assertEquals(HomeWork.sum (0,1),1);
        Assertions.assertEquals(HomeWork.sum (-1,2),1);
        Assertions.assertEquals(HomeWork.sum (-1,-2),-3);
        Assertions.assertEquals(HomeWork.sum (Integer.MAX_VALUE, 2),-1);

    }


    @Test
    void average() {
        Assertions.assertEquals(HomeWork3.average([1,2, 3, 4,5] 3);
    }
}