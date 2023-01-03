package com.ocnunez.calculatorapp.presentation

import androidx.compose.runtime.Composable
import com.ocnunez.calculatorapp.domain.CalculatorAction

data class CalculatorUIAction(
    val text: String?,
    val highlightLevel: HighlightLevel,
    val action: CalculatorAction,
    val content: @Composable () -> Unit = {}
)

sealed interface HighlightLevel {
    object Neutral: HighlightLevel
    object SemiHighlighted: HighlightLevel
    object Highlighted: HighlightLevel
    object StronglyHighlighted: HighlightLevel
}
