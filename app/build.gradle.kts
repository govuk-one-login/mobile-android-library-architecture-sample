import com.android.build.api.dsl.ApplicationExtension
import uk.gov.onelogin.build.extensions.setApplicationId
import uk.gov.onelogin.build.extensions.setNamespace

plugins {
    id("uk.gov.onelogin.build.android-app-config")
}

configure<ApplicationExtension> {
    setApplicationId(suffix = ".app")
    setNamespace(suffix = ".app")

    defaultConfig {
        versionCode = 1
        versionName = "1.0"
    }
}
dependencies {
    implementation(project(":sdk:public-api"))
    implementation(project(":libraries:network"))
}