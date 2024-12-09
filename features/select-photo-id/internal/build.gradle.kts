import com.android.build.api.dsl.LibraryExtension
import uk.gov.onelogin.build.extensions.setNamespace

plugins {
    id("uk.gov.onelogin.build.android-lib-config")
}

configure<LibraryExtension> {
    setNamespace(suffix = ".features.selectphotoid.internal")
}

dependencies {

    implementation(project(":features:prove-identity:internal-api"))
    implementation(project(":libraries:compose"))
    implementation(project(":libraries:navigation"))
    implementation(project(":libraries:di"))
}