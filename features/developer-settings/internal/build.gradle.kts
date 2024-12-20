import com.android.build.api.dsl.LibraryExtension
import uk.gov.onelogin.build.extensions.setNamespace

plugins {
    id("uk.gov.onelogin.build.android-lib-config")
}

configure<LibraryExtension> {
    setNamespace(suffix = ".features.developersettings.internal")
}

dependencies {
    implementation(project(":features:developer-settings:internal-api"))
    implementation(project(":features:developer-settings:public-api"))
    implementation(project(":features:active-session:internal-api"))
    implementation(project(":libraries:di"))
}