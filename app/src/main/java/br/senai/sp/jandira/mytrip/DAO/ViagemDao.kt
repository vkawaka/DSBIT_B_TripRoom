package br.senai.sp.jandira.mytrip.DAO

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.senai.sp.jandira.mytrip.model.Viagem

@Dao
interface ViagemDao {

    @Insert
    fun salvar(viagem: Viagem): Long

    @Update
    fun atualizar(viagem: Viagem): Int

    @Delete
    fun excluir(viagem: Viagem)

    @Query("SELECT * FROM tbl_viagem ORDER BY destino ASC")
    fun listarTodosAsViagens(): List<Viagem>

}