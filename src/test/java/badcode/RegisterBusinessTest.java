package badcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterBusinessTest {

    @Test
    @DisplayName("ข้อมูล speaker = null จะโดย runtime exception กลับมา " +
            "พร้อมกับ message Speaker is null")
    public void case01() {
        RegisterBusiness business = new RegisterBusiness();

        // Assert exception with JUnit 5 ?
        Exception exception = assertThrows(RuntimeException.class, () -> {
            business.register(null, null);
        });
        assertEquals("Speaker is null", exception.getMessage());
    }

    @Test
    @DisplayName("First name = null ดังนั้นจะโยน ArgumentNullException ออกมา " +
            "พร้อมกับคำว่า First name is required.")
    public void case02() {
        RegisterBusiness business = new RegisterBusiness();
        Exception exception = assertThrows(ArgumentNullException.class, () -> {
            business.register(null, new Speaker());
        });
        assertEquals("First name is required.", exception.getMessage());
    }
}