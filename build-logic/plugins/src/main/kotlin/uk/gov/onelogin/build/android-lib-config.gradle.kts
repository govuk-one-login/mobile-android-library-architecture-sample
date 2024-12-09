package uk.gov.onelogin.build

import com.squareup.anvil.plugin.AnvilExtension
import com.android.build.gradle.LibraryExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension
import uk.gov.onelogin.build.extensions.appDeps
import org.gradle.accessors.dm.LibrariesForLibs
import uk.gov.onelogin.build.extensions.setAndroidSdkVersions
import uk.gov.onelogin.build.extensions.setUiConfig
import uk.gov.onelogin.build.extensions.libDeps
import uk.gov.onelogin.build.extensions.setJavaVersion
import uk.gov.onelogin.build.extensions.setPackagingConfig

//https://github.com/gradle/gradle/issues/15383
val libs = the<LibrariesForLibs>()

listOf(
    libs.plugins.android.library,
    libs.plugins.kotlin.android,
    libs.plugins.kotlin.serialization,
    libs.plugins.compose.compiler,
    libs.plugins.ksp,
    libs.plugins.anvil,
).forEach {
    project.plugins.apply(it.get().pluginId)
}


configure<LibraryExtension> {
    setAndroidSdkVersions()
    setUiConfig()
    setJavaVersion()
    setUiConfig()
    setPackagingConfig()
}

configure<KotlinAndroidProjectExtension> {
    setJavaVersion()
}

dependencies {
    appDeps(libs)
    libDeps(libs)
}

configure<AnvilExtension> {
    disableComponentMerging = false
    useKsp(
        contributesAndFactoryGeneration = true,
        componentMerging = true,
    )
}