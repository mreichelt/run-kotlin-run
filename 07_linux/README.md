# Run Kotlin on Linux

Build with: `./gradlew :07_linux:build`

Run ARM64 Linux binary with Docker on Mac:

```shell
docker run --rm --platform linux/arm64 -v $(pwd):/workdir -w /workdir ubuntu /workdir/build/bin/linuxArm64/isPrimeReleaseExecutable/isPrime.kexe 8 9 10 11 12 13 9223370998999999967 9223370999000000069 9223370999000000077
```

Run X64 Linux binary (slower on Arm64 hardware due to emulation, but it works):
```shell
docker run --rm --platform linux/amd64 -v $(pwd):/workdir -w /workdir ubuntu /workdir/build/bin/linuxX64/isPrimeReleaseExecutable/isPrime.kexe 8 9 10 11 12 13 9223370998999999967 9223370999000000069 9223370999000000077
```
