import com.android.build.api.dsl.LibraryExtension
import uk.gov.onelogin.build.extensions.setNamespace

plugins {
    id("uk.gov.onelogin.build.android-lib-config")
}

configure<LibraryExtension> {
    setNamespace(suffix = ".library.api")
}

dependencies {
    // Public API
    api(project(":features:developer-settings:public-api"))
    api(project(":features:prove-identity:public-api"))
    api(project(":features:clear-data:public-api"))
    api(project(":sdk:shared-api"))

    // Internal
    implementation(project(":sdk:internal"))
    implementation(project(":libraries:compose"))
    implementation(project(":libraries:network"))
    implementation(project(":libraries:di"))
}
