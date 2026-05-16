plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    mingwX64 {
        binaries {
            executable("isPrime")
        }
    }

    sourceSets {
        mingwMain.dependencies {
            implementation(project(":common"))
        }
    }
}
