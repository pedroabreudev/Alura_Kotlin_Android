package br.com.pedroabreudev.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import br.com.pedroabreudev.orgs.R
import br.com.pedroabreudev.orgs.dao.ProdutosDao
import br.com.pedroabreudev.orgs.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_produto)

        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)
        botaoSalvar.setOnClickListener {
            val campoNome = findViewById<EditText>(R.id.nome)
            val nome = campoNome.text.toString()
            val campoDescricao = findViewById<EditText>(R.id.descricao)
            val descricao = campoDescricao.text.toString()
            val campoValor = findViewById<EditText>(R.id.valor)
            val valor = campoValor.text.toString()
            val valorProduto = if (valor.isBlank()) {
                BigDecimal.ZERO
            } else {
                BigDecimal(valor)
            }

            val produtoCriado = Produto(
                nome = nome,
                descricao = descricao,
                valor = valorProduto
            )
            Log.i("Formulario Produto Activity", "onCreate: $produtoCriado")
            val dao = ProdutosDao()
            dao.adiciona(produtoCriado)
            finish()
        }
    }
}