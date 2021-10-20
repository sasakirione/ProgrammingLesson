import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun fizzBuzzTest() {
        fizzBuzz()
    }

    @Test
    fun countPrimeTest() {
        Assertions.assertEquals(169, countPrime())
    }
}