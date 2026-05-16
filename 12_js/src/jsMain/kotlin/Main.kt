fun main() {
    console.log("Hello Kotlin/JS!")

    (1L..100L).forEach { n ->
        console.log("$n" + if (isPrime(n)) " is a prime" else " is NOT a prime")
    }
}
