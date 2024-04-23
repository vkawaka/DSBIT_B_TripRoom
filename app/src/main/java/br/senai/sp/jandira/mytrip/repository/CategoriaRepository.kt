package br.senai.sp.jandira.mytrip.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mytrip.R
import br.senai.sp.jandira.mytrip.model.Categorias

class CategoriaRepository {
    @Composable
    fun listarTodasAsCategorias():List<Categorias>{
        val montanha = Categorias()
        montanha.id = 1
        montanha.nome = "Montanha"
        montanha.image = painterResource(id = R.drawable.montanha)

        val neve = Categorias()
        neve.id = 2
        neve.nome = "Neve"
        neve.image = painterResource(id = R.drawable.snow)

        val praia = Categorias()
        praia.id = 3
        praia.nome = "Praia"
        praia.image = painterResource(id = R.drawable.praia)

        val cidade = Categorias()
        cidade.id = 1
        cidade.nome = "Montanha"
        cidade.image = painterResource(id = R.drawable.cidade)


        return listOf(montanha, neve, praia, cidade)
    }
}