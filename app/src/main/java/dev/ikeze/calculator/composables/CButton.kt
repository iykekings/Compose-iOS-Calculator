package dev.ikeze.calculator.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

enum class ButtonType {
    Number,
    Special,
    Operator
}

enum class ButtonSize {
    Wide,
    Normal,
}

@Composable
fun CButton(
    type: ButtonType = ButtonType.Number,
    text: String,
    size: ButtonSize = ButtonSize.Normal,
    onClick: () -> Unit,
    isActive: Boolean = false
) {
    val bgColor = when (type) {
        ButtonType.Number -> MaterialTheme.colors.secondary
        ButtonType.Special -> MaterialTheme.colors.secondaryVariant
        ButtonType.Operator -> MaterialTheme.colors.primary
    }
    val bgColorActive = if (isActive && type == ButtonType.Operator) Color.White else bgColor
    val fontColor = if (type != ButtonType.Special) Color.White else Color.Black
    val fontColorActive = if (isActive && type == ButtonType.Operator) MaterialTheme.colors.primary else fontColor
    val defaultSize = 90
    val width = if (size == ButtonSize.Normal) defaultSize.dp else (defaultSize * 2).dp
    val fontSize =  if (type != ButtonType.Operator) (defaultSize / 2.2).sp else (defaultSize / 1.8).sp
    Button(
        onClick = onClick,
        modifier = Modifier
            .size(width = width, height = defaultSize.dp)
            .clip(CircleShape),
        colors = ButtonDefaults.buttonColors(backgroundColor = bgColorActive)
    ) {
        Text(
            text = text,
            fontSize = if (text == "AC") (defaultSize / 2.6).sp else fontSize,
            fontWeight = FontWeight.W400,
            color = fontColorActive,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 5.dp),
            textAlign = if (size == ButtonSize.Normal) TextAlign.Center else TextAlign.Start
        )
    }
}

@Preview
@Composable
fun CButtonPreview() {
    CButton(type = ButtonType.Number, text = "1", size = ButtonSize.Wide, onClick = {})
}
