package br.senai.sp.jandira.mytrip.DAO

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.mytrip.model.Usuarios
import br.senai.sp.jandira.mytrip.model.Viagem

@Database(entities = [Usuarios::class], version = 2)
abstract class BancoDB : RoomDatabase() {

    abstract fun usuarioDao(): UsuarioDAO

    companion object{
        private lateinit var instancia: BancoDB

        fun getBancoDeDados(context: Context): BancoDB{
            instancia = Room
                .databaseBuilder(
                    context,
                    BancoDB::class.java,
                    "db_viagens"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return instancia
        }

    }

}