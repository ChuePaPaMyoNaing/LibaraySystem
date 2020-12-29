package jp.co.cybermissions.com.example.libaraysystem.detail

import android.app.Application
import androidx.lifecycle.*
import jp.co.cybermissions.com.example.libaraysystem.book.Book


class DetailViewModel( book: Book,
                       app: Application
) : AndroidViewModel(app) {
    //argument for book selected
    private val _selectedProperty = MutableLiveData<Book>()
    val selectedProperty: LiveData<Book>
        get() = _selectedProperty

    init {
        _selectedProperty.value = book
    }
}