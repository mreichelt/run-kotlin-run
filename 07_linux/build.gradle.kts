plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    listOf(
        linuxArm64(),
        linuxX64(),
    ).forEach {
        it.binaries {
            executable("isPrime")
        }
    }

    sourceSets {
        linuxMain.dependencies {
            implementation(project(":common"))
        }
    }
}
