pluginManagement {
    includeBuild("./build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "library-initialisation-poc"
include(":app")

include(":sdk:public-api")
include(":sdk:shared-api")
include(":sdk:internal")

include(":features:prove-identity:public-api")
include(":features:prove-identity:internal-api")
include(":features:prove-identity:internal")
include(":features:select-photo-id:internal")
include(":features:clear-data:public-api")
include(":features:clear-data:internal")
include(":features:developer-settings:public-api")
include(":features:developer-settings:internal-api")
include(":features:developer-settings:internal")

include(":libraries:active-session")
include(":libraries:compose")
include(":libraries:di")
include(":libraries:navigation")
include(":libraries:network")
