package com.example.kodeindependencyinjection.data.db

import androidx.lifecycle.LiveData
import com.example.kodeindependencyinjection.data.model.Quote

interface QuoteDao {
    fun addQuote(quote: Quote)

    fun getAllQuotes() : LiveData<List<Quote>>
}