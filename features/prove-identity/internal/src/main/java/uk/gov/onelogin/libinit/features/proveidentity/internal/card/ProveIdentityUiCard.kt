package uk.gov.onelogin.libinit.features.proveidentity.internal.card

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Card as M3Card
import uk.gov.onelogin.libinit.features.proveidentity.internal.R as InternalR

/**
 * A card that displays if a user to start proving their identity.
 *
 * If a user has already proved their identity, this card will not display.
 *
 * This card should be used in conjunction with [ProveIdentityModal].
 *
 * @param onStartClick Called when the call-to-action button is clicked.
 * @param modifier See [Modifier].
 */
@Composable
internal fun ProveIdentityUiCard(
    onStartClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    M3Card(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = stringResource(InternalR.string.prove_identity_card_title),
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                text = stringResource(InternalR.string.prove_identity_card_body),
            )
            Button(
                onClick = onStartClick,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(InternalR.string.prove_identity_card_button),
                )
            }
        }
    }
}

@Preview
@Composable
fun ProveIdentityUiCardPreview() {
    ProveIdentityUiCard(
        onStartClick = {}
    )
}
