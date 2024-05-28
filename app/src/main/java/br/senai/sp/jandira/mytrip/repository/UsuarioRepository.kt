package br.senai.sp.jandira.mytrip.repository

import android.content.Context
import androidx.compose.runtime.Composable
import br.senai.sp.jandira.mytrip.model.Usuarios
import br.senai.sp.jandira.mytrip.DAO.UsuarioDAO
import br.senai.sp.jandira.mytrip.DAO.BancoDB

class UsuarioRepository(context: Context) {
    private val dao = BancoDB.getBancoDeDados(context).usuarioDao()

    fun salvar(usuario: Usuarios): Long {
        return dao.salvar(usuario)
    }

    @Composable
    fun listarTodosUsuarios(): List<Usuarios> {
        return dao.listarTodososUsuarios()
    }

    fun verificarCredenciais(email: String, senha: String): Boolean {
        val usuario = dao.buscarUsuarioPeloEmail(email)
        return usuario != null && usuario.senha == senha
    }
}