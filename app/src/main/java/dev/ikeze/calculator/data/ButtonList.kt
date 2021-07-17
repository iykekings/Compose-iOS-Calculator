package dev.ikeze.calculator.data

import androidx.compose.runtime.Composable
import dev.ikeze.calculator.composables.ButtonSize
import dev.ikeze.calculator.composables.ButtonType
import dev.ikeze.calculator.composables.CButton

data class CalculatorButton(
    val type: ButtonType = ButtonType.Number,
    val text: String,
    val size: ButtonSize = ButtonSize.Normal,
    val onClick: () -> Unit
)


val ButtonList = listOf(
    CalculatorButton(type = ButtonType.Special, text = "AC", onClick = {}),
    CalculatorButton(type = ButtonType.Special, text = "±", onClick = {}),
    CalculatorButton(type = ButtonType.Special, text = "%", onClick = {}),
    CalculatorButton(type = ButtonType.Operator, text = "÷", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "7", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "8", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "9", onClick = {}),
    CalculatorButton(type = ButtonType.Operator, text = "×", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "4", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "5", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "6", onClick = {}),
    CalculatorButton(type = ButtonType.Operator, text = "–", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "1", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "2", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = "3", onClick = {}),
    CalculatorButton(type = ButtonType.Operator, text = "+", onClick = {}),
    CalculatorButton(type = ButtonType.Number, size = ButtonSize.Wide, text = "0", onClick = {}),
    CalculatorButton(type = ButtonType.Number, text = ".", onClick = {}),
    CalculatorButton(type = ButtonType.Operator, text = "=", onClick = {}),
)

@Composable
fun CalculatorButton.ToCButton(onClick: () -> Unit, isActive: Boolean = false) {
    CButton(text = text, size = size, onClick = onClick, type = type, isActive = isActive)
}