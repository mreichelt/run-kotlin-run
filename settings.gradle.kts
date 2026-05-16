pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "run-kotlin-run"
include(":common")
include(":01_jvm")
include(":02_android")
// 03: ios
include(":04_gradle")
// 05: playground
include(":06_macos")
include(":07_linux")
include(":08_windows")
// 09: scratch files
