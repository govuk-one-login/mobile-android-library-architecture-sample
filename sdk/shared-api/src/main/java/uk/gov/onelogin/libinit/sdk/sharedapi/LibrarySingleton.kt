package uk.gov.onelogin.libinit.sdk.sharedapi

interface LibrarySingleton {
    val component: LibrarySingletonComponent
    fun clearData()
}