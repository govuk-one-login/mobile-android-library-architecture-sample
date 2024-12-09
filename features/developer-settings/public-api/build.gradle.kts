import com.android.build.api.dsl.LibraryExtension
import uk.gov.onelogin.build.extensions.setNamespace

plugins {
    id("uk.gov.onelogin.build.android-lib-config")
}

configure<LibraryExtension> {
    setNamespace(suffix = ".features.developersettings.api")
}

dependencies {
    implementation(project(":sdk:shared-api"))
    implementation(project(":features:developer-settings:internal-api"))
}