plugins {
  // Apply the Android Application plugin with an explicit version
  id("com.android.application") version "8.2.1"
  // Apply the Kotlin Android plugin
  kotlin("android") version "2.0.21"
}

android {
  // The package under which R, BuildConfig, etc. are generated
  namespace = "com.example.hellojitpackapp"

  compileSdk = 34

  defaultConfig {
    applicationId = "com.example.hellojitpackapp"
    minSdk        = 21
    targetSdk     = 34

    versionCode   = 1
    versionName   = "1.0"
  }

  compileOptions {
    // Make sure we use Java 1.8 for both source and target compatibility
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  kotlinOptions {
    // Ensure Kotlin emits 1.8-compatible bytecode
    jvmTarget = "1.8"
  }
}

dependencies {
  // AndroidX AppCompat (for TextView, AppCompatActivity, etc.)
  implementation("androidx.appcompat:appcompat:1.6.1")

  // Your JitPack library (replace v1.0.1 with whatever tag you’re targeting)
  implementation("com.github.jkoutavas:hello-world-android-lib:v1.0.1")
}