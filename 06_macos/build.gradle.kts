plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    macosArm64 {
        binaries {
            executable("isPrime")
        }
    }

    sourceSets {
        appleMain.dependencies {
            implementation(project(":common"))
        }
    }
}
