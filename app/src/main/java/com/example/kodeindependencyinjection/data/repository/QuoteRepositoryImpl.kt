package com.example.kodeindependencyinjection.data.repository

import com.example.kodeindependencyinjection.data.db.QuoteDao
import com.example.kodeindependencyinjection.data.model.Quote

class QuoteRepositoryImpl(private val quoteDao: QuoteDao) : QuoteRepository {

    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getAllQuotes() = quoteDao.getAllQuotes()
}