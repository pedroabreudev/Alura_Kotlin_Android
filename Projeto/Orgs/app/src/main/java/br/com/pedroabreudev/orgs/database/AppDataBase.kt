package br.com.pedroabreudev.orgs.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import br.com.pedroabreudev.orgs.database.converter.Converters
import br.com.pedroabreudev.orgs.database.dao.ProdutoDao
import br.com.pedroabreudev.orgs.model.Produto

@Database(entities = [Produto::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDataBase : RoomDatabase() {
    abstract fun produtoDao(): ProdutoDao
}