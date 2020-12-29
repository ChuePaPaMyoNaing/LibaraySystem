package jp.co.cybermissions.com.example.libaraysystem.list


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import jp.co.cybermissions.com.example.libaraysystem.book.Book


class ListViewModel: ViewModel() {

    private val _properties = MutableLiveData<List<Book>>()
    val properties: LiveData<List<Book>>
        get() = _properties

    private val _navigateToSelectedProperty = MutableLiveData<Book>()
    val navigateToSelectedProperty: LiveData<Book>
        get() = _navigateToSelectedProperty

    fun displayPropertyDetails(book: Book){
        _navigateToSelectedProperty.value = book
    }

    fun displayPropertyDetailsComplete(){
        _navigateToSelectedProperty.value = null
    }
}