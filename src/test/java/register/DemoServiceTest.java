package register;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoServiceTest {

    @Test
    void case_1_should_get_2() {
        DB db = new DBX();
        DemoService demoService = new DemoService(db); // Constructor inject
        String actualResult = demoService.compute(1);
        assertEquals("Result = 2", actualResult);
    }
}

class DBX implements DB {
    @Override
    public int increaseOne(int id) {
        return 2;
    }
}