package uk.gov.onelogin.build

import com.android.build.api.dsl.ApplicationExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension
import uk.gov.onelogin.build.extensions.appDeps
import org.gradle.accessors.dm.LibrariesForLibs
import uk.gov.onelogin.build.extensions.setAndroidSdkVersions
import uk.gov.onelogin.build.extensions.setBuildTypes
import uk.gov.onelogin.build.extensions.setUiConfig
import uk.gov.onelogin.build.extensions.setJavaVersion
import uk.gov.onelogin.build.extensions.setPackagingConfig

//https://github.com/gradle/gradle/issues/15383
val libs = the<LibrariesForLibs>()

listOf(
    libs.plugins.android.application,
    libs.plugins.kotlin.android,
    libs.plugins.compose.compiler,
).forEach {
    project.plugins.apply(it.get().pluginId)
}

configure<ApplicationExtension> {
    setAndroidSdkVersions()
    setUiConfig()
    setBuildTypes()
    setJavaVersion()
    setUiConfig()
    setPackagingConfig()
}

configure<KotlinAndroidProjectExtension> {
    setJavaVersion()
}

dependencies {
    appDeps(libs)
}
