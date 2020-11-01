package com.example.kodeindependencyinjection

import android.app.Application
import com.example.kodeindependencyinjection.data.db.Database
import com.example.kodeindependencyinjection.data.db.DatabaseFakeImpl
import com.example.kodeindependencyinjection.data.db.QuoteDao
import com.example.kodeindependencyinjection.data.repository.QuoteRepository
import com.example.kodeindependencyinjection.data.repository.QuoteRepositoryImpl
import com.example.kodeindependencyinjection.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.bindings.Singleton
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuoteApplication : Application(), KodeinAware{
    override val kodein = Kodein.lazy {
        bind<Database>() with singleton {DatabaseFakeImpl()}
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao}
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance())}
        bind() from provider{ QuotesViewModelFactory((instance()))}//same class
    }

}