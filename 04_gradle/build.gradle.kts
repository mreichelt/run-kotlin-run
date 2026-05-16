@CacheableTask
abstract class GetPrimeFilesTask : DefaultTask() {

    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.NAME_ONLY)
    abstract val inputDirectory: DirectoryProperty

    @get:OutputDirectory
    abstract val outputDirectory: DirectoryProperty

    @TaskAction
    fun execute() {
        val inputDir = inputDirectory.get().asFile
        val outputDir = outputDirectory.get().asFile

        outputDir.deleteRecursively()
        outputDir.mkdirs()

        inputDir.listFiles { it.isFile && it.name.toLongOrNull() != null }.forEach { file ->
            val number = file.name.toLong()
            if (isPrime(number)) {
                logger.info("$number is a prime, copying")
                file.copyTo(File(outputDir, file.name))
            }
        }
    }

    private fun isPrime(n: Long): Boolean {
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
}

tasks.register<GetPrimeFilesTask>("getPrimeFiles") {
    inputDirectory.convention(layout.projectDirectory.dir("numbers"))
    outputDirectory.convention(layout.buildDirectory.dir("primes"))
}
