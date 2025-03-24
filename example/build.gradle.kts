import org.gradle.internal.impldep.org.junit.experimental.categories.Categories.CategoryFilter.include
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    application
    alias(libs.plugins.kotlin.jvm)
}

application {
    applicationName = "maestro-example"
    mainClass.set("MainKt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(project(":maestro-utils"))
    implementation(project(":maestro-client"))
    implementation(project(":maestro-orchestra"))
    implementation(project(":maestro-ios"))
}

