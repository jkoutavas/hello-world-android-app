import org.gradle.api.tasks.Delete

// No plugins or repositories here — everything comes from settings.gradle.kts

// Define a 'clean' task to delete the root build directory
tasks.register<Delete>("clean") {
  delete(rootProject.buildDir)
}