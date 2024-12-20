import com.android.build.api.dsl.LibraryExtension
import uk.gov.onelogin.build.extensions.setNamespace

plugins {
    id("uk.gov.onelogin.build.android-lib-config")
}

configure<LibraryExtension> {
    setNamespace(suffix = ".sdk.internal")
}

dependencies {
    implementation(project(":sdk:shared-api"))
    implementation(project(":features:developer-settings:public-api"))
    implementation(project(":features:developer-settings:internal-api"))
    implementation(project(":features:developer-settings:internal"))
    implementation(project(":features:prove-identity:public-api"))
    implementation(project(":features:prove-identity:internal-api"))
    implementation(project(":features:prove-identity:internal"))
    implementation(project(":features:select-photo-id:internal"))
    implementation(project(":features:clear-data:public-api"))
    implementation(project(":features:clear-data:internal"))
    implementation(project(":features:active-session:internal-api"))
    implementation(project(":features:active-session:internal"))
    implementation(project(":libraries:compose"))
    implementation(project(":libraries:di"))
    implementation(project(":libraries:network"))
    implementation(project(":libraries:navigation"))
}
