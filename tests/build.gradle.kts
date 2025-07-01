val dependencyObjects = listOf(
    libs.junit.jupiter.api,
    libs.junit.jupiter.engine,
    libs.junit.platform.commons,
    libs.junit.platform.engine,
    libs.kotlin.stdlib,
    libs.opentest,

    project(":library"),
)

dependencies {
    coreLibraryDesugaring(libs.android.desugaring)

    for (dep in dependencyObjects) {
        implementation(dep)
        testImplementation(dep)
    }
}

afterEvaluate {
    tasks.matching { task -> task.name.contains("UnitTest") }
        .forEach { task -> task.enabled = true }
}
