package uk.gov.onelogin.libinit.features.activesession.internalapi

interface ActiveSessionApi {
    fun getActiveSession(): Boolean

    fun createActiveSession()

    fun expireActiveSession()
}

