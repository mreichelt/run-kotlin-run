# Run Kotlin in Scratch file

- Create a new scratch file: `Cmd + Shift + N` -> Kotlin
  - or search for action "Scratch File" (e.g. in Search Everywhere)
- Select classpath: `run-kotlin-run.common.jvmMain` (other JVM-compatible classpaths also work, e.g. 01_jvm or androidHostTest)
- Run Kotlin!

Example:

```kotlin
(1L..20L).filter { isPrime(it) }
```

Interactive is possible, too!
