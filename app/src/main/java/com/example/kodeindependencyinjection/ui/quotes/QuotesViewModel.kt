package com.example.kodeindependencyinjection.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.kodeindependencyinjection.data.model.Quote
import com.example.kodeindependencyinjection.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    fun getAllQuotes() = quoteRepository.getAllQuotes()
}