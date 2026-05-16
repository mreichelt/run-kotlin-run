# Find Primes in Kotlin/JS

## Browser

Run in development or production mode:

```bash
./gradlew :12_js:jsBrowserDevelopmentRun -t
./gradlew :12_js:jsBrowserProductionRun -t
```

Then open the console in the browser.

## CLI with Node

```bash
./gradlew :12_js:jsNodeProductionRun
```

Or run the file directly:

```bash
node 12_js/build/compileSync/js/main/productionExecutable/kotlin/run-kotlin-run-12_js.js
```

## To update Yarn lock file

```bash
./gradlew kotlinUpgradeYarnLock
```
