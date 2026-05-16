# Finding Primes with Gradle

The `getPrimeFiles` task will find files that have prime numbers as file names, and will copy them
to the `build/primes` directory. Run with:

```
./gradlew getPrimeFiles

# ensure to run (instead of getting from build cache)
./gradlew getPrimeFiles --rerun

# also get logs
./gradlew getPrimeFiles --rerun --info
```
