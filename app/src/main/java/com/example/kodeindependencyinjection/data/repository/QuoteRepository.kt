package com.example.kodeindependencyinjection.data.repository

import androidx.lifecycle.LiveData
import com.example.kodeindependencyinjection.data.model.Quote

interface QuoteRepository {
    fun addQuote(quote: Quote)

    fun getAllQuotes() : LiveData<List<Quote>>
}