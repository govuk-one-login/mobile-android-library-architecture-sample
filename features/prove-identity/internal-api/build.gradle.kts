import com.android.build.api.dsl.LibraryExtension
import uk.gov.onelogin.build.extensions.setNamespace

plugins {
    id("uk.gov.onelogin.build.android-lib-config")
}

configure<LibraryExtension> {
    setNamespace(suffix = ".features.proveidentity.internalapi")
}

dependencies {
    implementation(project(":libraries:di"))
    implementation(project(":libraries:navigation"))
}