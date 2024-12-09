package uk.gov.onelogin.build.extensions

import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.accessors.dm.LibrariesForLibs

internal fun DependencyHandlerScope.implementation(
    dependency: Any,
) = dependencies.add("implementation",  dependency)

internal fun DependencyHandlerScope.debugImplementation(
    dependency: Any,
) = dependencies.add("debugImplementation",  dependency)

internal fun DependencyHandlerScope.testImplementation(
    dependency: Any,
) = dependencies.add("testImplementation",  dependency)

internal fun DependencyHandlerScope.testRuntimeOnly(
    dependency: Any,
) = dependencies.add("testRuntimeOnly",  dependency)

internal fun DependencyHandlerScope.androidTestImplementation(
    dependency: Any,
) = dependencies.add("androidTestImplementation",  dependency)

internal fun DependencyHandlerScope.androidTestUtil(
    dependency: Any,
) = dependencies.add("androidTestUtil",  dependency)

internal fun DependencyHandlerScope.ksp(
    dependency: Any,
) = dependencies.add("ksp",  dependency)

internal fun DependencyHandlerScope.appDeps(libs: LibrariesForLibs) {
    listOf(
        libs.androidx.core.ktx,
        libs.androidx.appcompat,
        libs.material,
        libs.androidx.lifecycle.runtime.ktx,
        libs.androidx.activity.compose,
        platform(libs.androidx.compose.bom),
        libs.androidx.ui,
        libs.androidx.ui.graphics,
        libs.androidx.ui.tooling.preview,
        libs.androidx.material3,
        libs.timber
    ).forEach {
        implementation(it)
    }
    debugImplementation(libs.androidx.ui.tooling)
}


internal fun DependencyHandlerScope.libDeps(libs: LibrariesForLibs) {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.timber)

    implementation(libs.dagger)
    ksp(libs.dagger.compiler)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
