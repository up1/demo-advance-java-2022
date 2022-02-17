package badcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RegisterFeeBusinessTest {

    @ParameterizedTest
    @CsvSource({
            "0,500",
            "1,500",
            "2,250",
            "5,100",
            "9,50",
            "10,0",
    })
    void getFee(int expYear, int expectedFee) {
        RegisterBusiness business = new RegisterBusiness();
        int actualFee = business.getFee(expYear);
        assertEquals(expectedFee, actualFee);
    }

    @ParameterizedTest
    @CsvSource(useHeadersInDisplayName = true, textBlock = """
            Year,   Expected Result
            0,      500
            1,      500
    """)
    void getFee2(int expYear, int expectedFee) {
        RegisterBusiness business = new RegisterBusiness();
        int actualFee = business.getFee(expYear);
        assertEquals(expectedFee, actualFee);

        String input = "sdfsdf" +
                "sdfsdf";

        String input2 = """
                dfgdfgkdfgjdfkgdjfg
                dfgdfgdfg
                   dfgdfgdfgdfg
                """;

    }
}