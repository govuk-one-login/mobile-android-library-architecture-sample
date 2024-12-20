package uk.gov.onelogin.libinit.features.activesession.internalapi

import kotlinx.coroutines.flow.StateFlow

interface GetActiveSessionUseCase {
    fun execute(): StateFlow<Boolean>
}

