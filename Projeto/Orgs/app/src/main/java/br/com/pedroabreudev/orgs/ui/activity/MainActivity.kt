package br.com.pedroabreudev.orgs.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.pedroabreudev.orgs.R
import br.com.pedroabreudev.orgs.model.Produto
import br.com.pedroabreudev.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(
                    nome = "Nome",
                    descricao = "Descricao",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "Nome",
                    descricao = "Descricao",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "Nome",
                    descricao = "Descricao",
                    valor = BigDecimal("19.99")
                ),
            )
        )
    }
}