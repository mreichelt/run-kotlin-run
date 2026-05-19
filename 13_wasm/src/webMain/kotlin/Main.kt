fun main() {
    for (n in listOf(1, 2, 3, 4, 5, 6, 7, 9223370998999999967L, 9223370998999999969L)) {
        println("$n " + if (isPrime(n)) "is a prime ✅" else "is not a prime ❌")
    }
}
