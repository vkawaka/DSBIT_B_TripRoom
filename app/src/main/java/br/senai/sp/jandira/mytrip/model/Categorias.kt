package br.senai.sp.jandira.mytrip.model

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mytrip.R
import java.time.LocalDate

data class Categorias(
    var id: Int = 0,
    var nome: String = "",
    var image: Painter? = null
)
