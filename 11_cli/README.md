# Kotlin CLI

## Installing

```shell
brew install kotlin
```

## Running

Run Kotlin expressions:

```bash
kotlin -expression '6*7'
kotlin -e 'kotlin.random.Random.nextInt(123)'
```

Run interactive REPL (Read-eval-print loop):

```bash
kotlin -repl
```

## Bonus

Make a .kts file executable! ❤️

1. Add `#!/usr/bin/env -S kotlinc -script` as the first line
2. Make the .kts executable: `chmod +x primes.kts`
3. Run it:

```bash
./primes.kts
```
