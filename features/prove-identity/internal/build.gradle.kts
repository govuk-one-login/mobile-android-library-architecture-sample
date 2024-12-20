import com.android.build.api.dsl.LibraryExtension
import uk.gov.onelogin.build.extensions.setNamespace

plugins {
    id("uk.gov.onelogin.build.android-lib-config")
}

configure<LibraryExtension> {
    setNamespace(suffix = ".features.proveidentity.internal")
}

dependencies {
    implementation(project(":features:prove-identity:public-api"))
    implementation(project(":features:prove-identity:internal-api"))
    implementation(project(":features:active-session:internal-api"))

    implementation(project(":libraries:di"))
    implementation(project(":libraries:compose"))
    implementation(project(":libraries:navigation"))
}