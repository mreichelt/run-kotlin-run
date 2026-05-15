import io.github.kotlin.fibonacci.isPrime

fun main(args: Array<String>) {
    for (arg in args) {
        val n = arg.toLong()
        println("$n " + if (isPrime(n)) "is a prime" else "is NOT a prime")
    }
}
