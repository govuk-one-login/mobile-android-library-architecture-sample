package uk.gov.onelogin.libinit.features.cleardata.api

/**
 * Interface for clearing the data associated with the prove identity flow.
 */
fun interface ClearDataUseCase {
    fun clearData()
}