package br.com.pedroabreudev.orgs.ui.dialog

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import br.com.pedroabreudev.orgs.databinding.FormularioImagemBinding
import br.com.pedroabreudev.orgs.extensions.tentaCarregarImagem

class FormularioImagemDialog(private val context: Context) {

    fun mostra(
        urlPadrao: String? = null,
        quandoImagemCarragada: (imagem: String) -> Unit
    ) {
        FormularioImagemBinding
            .inflate(LayoutInflater.from(context)).apply {

                urlPadrao?.let {
                    formularioImagemImageview.tentaCarregarImagem(it)
                    formularioImagemUrl.setText(it)
                }

                formularioImagemBotaoCarregar.setOnClickListener {
                    val url = formularioImagemUrl.text.toString()
                    formularioImagemImageview.tentaCarregarImagem(url)
                }

                AlertDialog.Builder(context)
                    .setView(root)
                    .setPositiveButton("Confirmar") { _, _ ->
                        val url = formularioImagemUrl.text.toString()
                        quandoImagemCarragada(url)
                    }
                    .setNegativeButton("Cancelar") { _, _ ->

                    }
                    .show()
            }
    }
}