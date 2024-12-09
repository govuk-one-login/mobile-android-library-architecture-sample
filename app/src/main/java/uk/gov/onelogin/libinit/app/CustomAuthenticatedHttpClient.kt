package uk.gov.onelogin.libinit.app

import uk.gov.onelogin.libinit.libraries.network.AuthenticatedHttpClient

class CustomAuthenticatedHttpClient(
    initialSession: Boolean = false
) : AuthenticatedHttpClient {
    private var session: Boolean = initialSession
    override fun makeAuthenticatedCall(request: String): Boolean {
        when (request) {
            "get-active-session" -> session
            "create-active-session" -> {
                session = true
            }

            "expire-active-session" -> {
                session = false
            }

            else -> error("not a valid network call")
        }
        return session
    }
}