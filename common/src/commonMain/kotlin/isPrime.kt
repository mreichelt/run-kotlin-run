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
