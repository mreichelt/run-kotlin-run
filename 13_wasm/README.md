# Find Primes in Kotlin with WebAssembly

## Browser

```bash
./gradlew :13_wasm:wasmJsBrowserDevelopmentRun
```

## CLI with Node (WebAssembly)

```bash
./gradlew :13_wasm:wasmJsNodeDevelopmentRun
```

## CLI with Node, WebAssembly with WASI

Get primes of the system time (in microseconds)!

```bash
./gradlew :13_wasm:wasmWasiNodeProductionRun
```

This will basically run this command under the hood:

```bash
~/.gradle/nodejs/node-v25.0.0-darwin-arm64/bin/node build/compileSync/wasmWasi/main/productionExecutable/optimized/run-kotlin-run-13_wasm.mjs
```

### With wasmtime

Make sure [wasmtime](https://wasmtime.dev/) is installed, then:

```bash
wasmtime run --wasm gc=y,exceptions=y,function-references=y --dir . build/compileSync/wasmWasi/main/productionExecutable/optimized/run-kotlin-run-13_wasm.wasm
```

Runs a bit slower than Node.
