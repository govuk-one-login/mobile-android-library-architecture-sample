
package uk.gov.onelogin.libinit.libraries.network

interface AuthenticatedHttpClient {
    fun makeAuthenticatedCall(request: String): Boolean
}
