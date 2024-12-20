package uk.gov.onelogin.libinit.features.activesession.internalapi

import kotlinx.coroutines.flow.StateFlow

interface ActiveSessionStore {
    fun read(): StateFlow<Boolean>

    fun write(value: Boolean)
}

