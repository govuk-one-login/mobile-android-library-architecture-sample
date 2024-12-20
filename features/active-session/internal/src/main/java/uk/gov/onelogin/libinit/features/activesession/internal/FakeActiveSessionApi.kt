package uk.gov.onelogin.libinit.features.activesession.internal

import com.squareup.anvil.annotations.ContributesBinding
import uk.gov.onelogin.libinit.features.activesession.internalapi.ActiveSessionApi
import uk.gov.onelogin.libinit.libraries.di.ActivityScope
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import uk.gov.onelogin.libinit.libraries.network.AuthenticatedHttpClient
import javax.inject.Inject

@ActivityScope
@ContributesBinding(LibraryScope::class)
class FakeActiveSessionApi @Inject constructor(
    private val authenticatedHttpClient: AuthenticatedHttpClient,
) : ActiveSessionApi {
    override fun getActiveSession(): Boolean =
        authenticatedHttpClient.makeAuthenticatedCall(
            request = "get-active-session"
        )

    override fun createActiveSession() {
        authenticatedHttpClient.makeAuthenticatedCall(
            request = "create-active-session"
        )
    }

    override fun expireActiveSession() {
        authenticatedHttpClient.makeAuthenticatedCall(
            request = "expire-active-session"
        )
    }
}

