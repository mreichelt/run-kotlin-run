# Find Primes with Kotlin in Debugger

1. Debug [Main.kt](src/jvmMain/kotlin/Main.kt) with breakpoint
2. In debug window: right-click → Evaluate Expression → Expand
3. Make sure to pick 'Kotlin' as language
4. Paste code and evaluate:

```kotlin
fun isPrime(n: Long): Boolean {
    if (n <= 1L) return false
    if (n == 2L) return true
    if (n % 2 == 0L) return false
    var i = 3L
    while (i * i <= n) {
        if (n % i == 0L) return false
        i += 2L
    }
    return true
}

data class Inputs(val numbers: Iterable<Long>)
data class Primes(val primes: List<Long>)

val inputs = Inputs(1L..100L)
val primes = Primes(inputs.numbers.filter { isPrime(it) })
primes.primes
```
