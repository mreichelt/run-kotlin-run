# Run Kotlin on Windows

Build with: `./gradlew :08_windows:build`

Then after installing [Wine](https://www.winehq.org/), run:

```shell
wine build/bin/mingwX64/isPrimeReleaseExecutable/isPrime.exe 8 9 10 11 12 13 9223370998999999967 9223370999000000069 9223370999000000077
```

To hide warnings:
```shell
WINEDEBUG=-all wine build/bin/mingwX64/isPrimeReleaseExecutable/isPrime.exe 8 9 10 11 12 13 9223370998999999967 9223370999000000069 9223370999000000077
```
