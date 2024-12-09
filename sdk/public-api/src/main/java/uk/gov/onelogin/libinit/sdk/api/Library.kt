package uk.gov.onelogin.libinit.sdk.api

import uk.gov.onelogin.libinit.sdk.sharedapi.LibrarySingleton
import uk.gov.onelogin.libinit.sdk.internal.LibrarySingletonImpl

object Library {
    fun createInstance(): LibrarySingleton = LibrarySingletonImpl()
}