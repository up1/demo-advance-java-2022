package demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    @DisplayName("เรากำลังทดสอบเรื่องอะไร อย่างไร ต้องได้อะไร")
    public void case01() {
        // Arrange, Given
        HelloWorld helloWorld = new HelloWorld();
        // Act, When
        String actualResult = helloWorld.hi("Somkiat");
        // Assert / verify, Then
        assertEquals("Hello Somkiat", actualResult);
    }

    @Test
    public void case02() {
    }

}