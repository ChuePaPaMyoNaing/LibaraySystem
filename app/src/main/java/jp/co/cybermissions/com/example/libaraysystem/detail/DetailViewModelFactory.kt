package jp.co.cybermissions.com.example.libaraysystem.detail

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import jp.co.cybermissions.com.example.libaraysystem.book.Book

class DetailViewModelFactory(
    private val booksProperty: Book,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(booksProperty, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
