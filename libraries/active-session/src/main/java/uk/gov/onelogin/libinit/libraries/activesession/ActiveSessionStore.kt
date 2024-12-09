package uk.gov.onelogin.libinit.libraries.activesession

import kotlinx.coroutines.flow.StateFlow

interface ActiveSessionStore {
    fun read(): StateFlow<Boolean>

    fun write(value: Boolean)
}

