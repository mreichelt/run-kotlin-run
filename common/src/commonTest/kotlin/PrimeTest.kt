import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

expect val isJs : Boolean

class PrimeTest {

    @Test
    fun `test first 4 numbers`() {
        assertFalse(isPrime(1))
        assertTrue(isPrime(2))
        assertTrue(isPrime(3))
        assertFalse(isPrime(4))
    }

    @Test
    fun `test first 20 primes`() {
        val expected = listOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71)
            .map { it.toLong() }
        val actual = (1L..71L).filter { isPrime(it) }
        assertContentEquals(expected, actual)
    }

    @Test
    fun `test big prime`() {
        assertTrue(isPrime(123456791L))
    }

    @Test
    fun `test bigger prime`() {
        if (isJs) return // takes too long for JS, so skip
        assertTrue(isPrime(922337203685474371L))
        assertFalse(isPrime(922337203685474373L))
    }


    @Test
    fun `long computation`() {
        if (isJs) return // takes too long for JS, so skip
        assertTrue(isPrime(9223370998999999967L))
        assertFalse(isPrime(9223370998999999969L))
    }

}
