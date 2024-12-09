package uk.gov.onelogin.libinit.libraries.activesession

import uk.gov.onelogin.libinit.libraries.di.ActivityScope
import uk.gov.onelogin.libinit.libraries.network.AuthenticatedHttpClient
import javax.inject.Inject

@ActivityScope
class ActiveSessionApi @Inject constructor(
    private val authenticatedHttpClient: AuthenticatedHttpClient,
) {
    fun getActiveSession(): Boolean =
        authenticatedHttpClient.makeAuthenticatedCall(
            request = "get-active-session"
        )

    fun createActiveSession() {
        authenticatedHttpClient.makeAuthenticatedCall(
            request = "create-active-session"
        )
    }

    fun expireActiveSession() {
        authenticatedHttpClient.makeAuthenticatedCall(
            request = "expire-active-session"
        )
    }
}

