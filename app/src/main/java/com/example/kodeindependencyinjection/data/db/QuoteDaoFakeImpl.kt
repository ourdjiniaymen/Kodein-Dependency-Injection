package com.example.kodeindependencyinjection.data.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kodeindependencyinjection.data.model.Quote

class QuoteDaoFakeImpl : QuoteDao {

    private val listQuotes = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = listQuotes
    }

    override fun addQuote(quote: Quote) {
        listQuotes.add(quote)
        quotes.value = listQuotes

    }

    override fun getAllQuotes() = quotes as LiveData<List<Quote>>

}