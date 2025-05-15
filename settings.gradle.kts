pluginManagement {
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
  }
}

dependencyResolutionManagement {
  // Prevent any repositories being declared in individual modules
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

  repositories {
    // Android Plugin and support artifacts
    google()

    // Your normal libs
    mavenCentral()

    // ← JitPack for your AAR
    maven { url = uri("https://jitpack.io") }
  }
}

rootProject.name = "HelloJitPackApp"
include(":app")