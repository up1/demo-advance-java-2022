package register;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DemoServiceTest {

    @Test
    void case_1_should_get_2() {
        DB dbStub = new DBX();
        DemoService demoService = new DemoService(dbStub); // Constructor inject
        String actualResult = demoService.compute(1, null);
        assertEquals("Result = 2", actualResult);
    }

    @Test
    void case_spy() {
        DbSpy spy = new DbSpy();
        DemoService demoService = new DemoService(spy); // Constructor inject
        // Act
        demoService.compute(1, null);
        // Assert
        spy.verify(1);
    }
}

class DbSpy implements DB {
    private int count;

    public void verify(int count) {
        assertTrue(count == this.count, "Must called = " + count + " but " +
                "called = " + this.count);
    }

    @Override
    public int increaseOne(int id) {
        if(id > 100) {
            //
        }
        count++;
        return 200000;
    }
}

class DBX implements DB {
    @Override
    public int increaseOne(int id) {
        return 2;
    }
}