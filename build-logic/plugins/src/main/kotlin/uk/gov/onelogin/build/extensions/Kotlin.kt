package uk.gov.onelogin.build.extensions

import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

internal fun KotlinAndroidProjectExtension.setJavaVersion() {
    jvmToolchain(JAVA_VERSION)
}
