package br.com.pedroabreudev.orgs.extensions

import android.widget.ImageView
import coil.load

fun ImageView.tentaCarregarImagem(url: String? = null){
    load(url) {
        fallback(br.com.pedroabreudev.orgs.R.drawable.erro)
        error(br.com.pedroabreudev.orgs.R.drawable.erro)
        placeholder(br.com.pedroabreudev.orgs.R.drawable.placeholder)
    }
}