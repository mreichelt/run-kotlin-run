@file:OptIn(ExperimentalWasmInterop::class, UnsafeWasmMemoryApi::class)

import kotlin.wasm.unsafe.Pointer
import kotlin.wasm.unsafe.UnsafeWasmMemoryApi
import kotlin.wasm.unsafe.withScopedMemoryAllocator

// clock example taken from https://github.com/Kotlin/kotlin-wasm-wasi-template

@WasmImport("wasi_snapshot_preview1", "clock_time_get")
private external fun wasiRawClockTimeGet(clockId: Int, precision: Long, resultPtr: Int): Int

private fun wasiGetTime(clockId: Int): Long = withScopedMemoryAllocator { allocator ->
    val rp0 = allocator.allocate(8)
    val returnCode = wasiRawClockTimeGet(
        clockId = clockId,
        precision = 1,
        resultPtr = rp0.address.toInt()
    )
    check(returnCode == 0) {
        "Invalid WASI return code $returnCode"
    }
    Pointer(rp0.address).loadLong()
}

private const val REALTIME = 0
private const val MONOTONIC = 1

fun main() {
    repeat(1000) {
        val microseconds = wasiGetTime(REALTIME) / 1000
        println("$microseconds " + if (isPrime(microseconds)) "is a prime ✅" else "is not a prime ")
    }
}
