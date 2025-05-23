package components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

val skills = listOf(
    "Android Development",
    "Kotlin",
    "Jetpack Compose",
    "Compose Multiplatform",
    "MVVM Architecture",
    "Kotlin Coroutines",
    "Animations API",
    "Canvas API",
    "Java",
    "TypeScript",
    "JS",
    "Html",
    "CSS",
)

@Composable
fun SkillSection(modifier: Modifier = Modifier, skills: List<String>, skillColorSet: Set<Pair<Color, Color>> = getSkillColorSet()) {
    FlowRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        skills.forEach { skill ->
            SkillChip(skill, skillColorSet.random())
        }
    }
}

@Composable
fun SkillChip(skill: String, skillColorSet: Pair<Color, Color>) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = skillColorSet.first,
        )
    ) {
        Text(
            style = MaterialTheme.typography.labelMedium,
            text = skill,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
            color = skillColorSet.second
        )
    }
}

@Composable
fun getSkillColorSet(): Set<Pair<Color, Color>> {
    val skillColorSet: Set<Pair<Color, Color>> = setOf(
        Pair(
            MaterialTheme.colorScheme.tertiaryContainer,
            MaterialTheme.colorScheme.onTertiaryContainer
        ),
        Pair(
            MaterialTheme.colorScheme.primaryContainer,
            MaterialTheme.colorScheme.onPrimaryContainer
        ),
        Pair(
            MaterialTheme.colorScheme.secondaryContainer,
            MaterialTheme.colorScheme.onSecondaryContainer
        ),
        Pair(MaterialTheme.colorScheme.surfaceContainer, MaterialTheme.colorScheme.onSurface),
    )
    return skillColorSet
}