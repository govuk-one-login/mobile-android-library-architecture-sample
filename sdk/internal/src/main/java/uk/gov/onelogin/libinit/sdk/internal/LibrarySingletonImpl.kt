package uk.gov.onelogin.libinit.sdk.internal

import uk.gov.onelogin.libinit.features.cleardata.api.ClearDataUseCase
import uk.gov.onelogin.libinit.sdk.sharedapi.LibrarySingleton
import uk.gov.onelogin.libinit.sdk.sharedapi.LibrarySingletonComponent
import javax.inject.Inject

class LibrarySingletonImpl : LibrarySingleton {
    private val mergedComponent =
        DaggerMergedBaseLibrarySingletonComponent.factory().create()

    override val component: LibrarySingletonComponent = mergedComponent

    init {
        mergedComponent.inject(this)
    }

    @Inject
    lateinit var clearDataUseCase: ClearDataUseCase

    override fun clearData() =
        clearDataUseCase.clearData()
}