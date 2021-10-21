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

    @Test
    fun findDistanceTest() {
        Assertions.assertEquals(15.5 , findDistance("調布"))
        Assertions.assertEquals(21.9 , findDistance("府中"))
    }
}