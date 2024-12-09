package uk.gov.onelogin.libinit.features.developersettings.internal

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun DeveloperSettingsCard(
    modifier: Modifier = Modifier,
    viewModel: DeveloperSettingsViewModel,
    debugCounter: Int,
    onClickDebugCounter: () -> Unit
) {
    val isActiveSession by viewModel.isActiveSession().collectAsState(false)

    Card(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Text(
                text = "Developer tools",
                style = MaterialTheme.typography.titleLarge,
            )
            FlowRow {
                if (isActiveSession) {
                    TextButton(
                        onClick = viewModel::onExpireSessionClick,

                        ) {
                        Text(text = "Expire session")
                    }
                } else {
                    TextButton(
                        onClick = viewModel::onCreateSessionClick
                    ) {
                        Text(text = "Create session")
                    }
                }
                DebugCounter(
                    debugCounter = debugCounter,
                    onClickDebugCounter = onClickDebugCounter
                )
            }
        }
    }
}

@Composable
private fun DebugCounter(
    debugCounter: Int,
    onClickDebugCounter: () -> Unit,
    modifier: Modifier = Modifier,
) {
    TextButton(
        onClick = onClickDebugCounter,
        modifier = modifier,
    ) {
        Text(text = "Recompose ($debugCounter)")
    }
}
