package br.senai.sp.jandira.mytrip.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mytrip.R
import br.senai.sp.jandira.mytrip.model.Viagem
import java.time.LocalDate

class ViagemRepository {
    @Composable
    fun listarTodasAsViagens(): List<Viagem>{
        val londres = Viagem()
        londres.id = 1
        londres.destino = "Londres"
        londres.descricao = "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana."
        londres.dataChegada = LocalDate.of(2019, 2, 18)
        londres.dataPartida = LocalDate.of(2019, 2, 21)
        londres.image = painterResource(id = R.drawable.londres)

        val porto = Viagem()
        porto.id = 2
        porto.destino = "Porto"
        porto.descricao = "Porto é uma cidade costeira no noroeste de Portugal conhecida pelas pontes imponentes e pela produção de vinho do Porto."
        porto.dataChegada = LocalDate.of(2022, 11, 3)
        porto.dataPartida = LocalDate.of(2022, 11, 2)
        porto.image = null

        val recife = Viagem()
        recife.id = 3
        recife.destino = "Recife"
        recife.descricao= "Recife, a capital do estado de Pernambuco, no nordeste do Brasil, distingue-se pelos seus vários rios, pontes, ilhéus e penínsulas. "
        recife.dataChegada = LocalDate.of(2017, 3, 7)
        recife.dataPartida = LocalDate.of(2017, 3, 10)
        recife.image = painterResource(id = R.drawable.recife)

        val boicucanga = Viagem()
        boicucanga.id = 4
        boicucanga.destino = "Praia de Boiçucanga"
        boicucanga.descricao = "A Praia de Boiçucanga é uma das mais movimentadas de São Sebastião. Com ampla rede de comércio e pousadas nos arredores, além de diversos restaurantes e quiosques à beira-mar, Boiçucanga é a praia ideal para quem não abre mão de agito, movimento e infraestrutura completa."
        boicucanga.dataChegada = LocalDate.of(2020, 10, 20)
        boicucanga.dataPartida = LocalDate.of(2020, 10, 28)
        boicucanga.image = painterResource(id = R.drawable.boicucanga)

        val jeju = Viagem()
        jeju.id = 5
        jeju.destino = "Ilha de Jeju"
        jeju.descricao = "A Ilha de Jeju é a maior ilha da Coreia do Sul, cobrindo uma área de 1.833,2 km², o que representa 1,83% da área total do país. "
        jeju.dataChegada = LocalDate.of(2022, 5, 9)
        jeju.dataPartida = LocalDate.of(2022, 5, 15)
        jeju.image = painterResource(id = R.drawable.jeju)



        return listOf(londres, porto, recife, boicucanga, jeju)
    }
}