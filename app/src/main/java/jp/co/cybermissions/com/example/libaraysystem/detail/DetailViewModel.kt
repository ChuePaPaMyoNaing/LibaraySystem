package jp.co.cybermissions.com.example.libaraysystem.detail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailViewModel: ViewModel() {
//    private val _book = MutableLiveData<String>()
//    val book: LiveData<String>
//        get() = _book
//
//    data class Book(
//            val text:  String)
//
////    private val books: MutableList<Book> = mutableListOf(
////            Book(text = "Java Programing language"),
////            Book(text = "HTML Programing language"),
////            Book(text = "RUBY Programing language"),
////            Book(text = "C# Programing language"),
////            Book(text = "DIGITAL Programing language"))
//
//    var booklist1 = listOf("Java Programing language", 3)
//    var booklist2 = listOf("HTML Programing language", 3)
//    var booklist3 = listOf("RUBY Programing language", 3)
//    var booklist4 = listOf("C# Programing language", 3)
//    var booklist5 = listOf("DIGITAL Programing language", 3);
//
//
//
////    lateinit var currentBook: Book
////    lateinit var text: MutableList<String>
////    //private var bookIndex = 0
////    private var bookIndex = 0
//
//    init {
//        //text = currentBook.text.toMutableList()
//        //currentBook = books[bookIndex++]
//        //onClick()
//
//
//
//
//    }
////    private fun onClick(){
////        for (i in booklist){
////            booklist.elementAt(1)
////        }
////    }
//
//    private fun onClick(){
////        println(booklist.get(0))
////        println(booklist.get(1))
////        println(booklist.get(2))
////        println(booklist.get(3))
////        println(booklist.get(4))
//    }
//
//
//
//    private fun resetBookList(){
//         if(booklist1.get(1)  == 0){
//
//         }
//
//    }
    var booklist1 = listOf("Java Programing language", 3)
    var booklist2 = listOf("HTML Programing language", 3)
    var booklist3 = listOf("RUBY Programing language", 3)
    var booklist4 = listOf("C# Programing language", 3)
    var booklist5 = listOf("DIGITAL Programing language", 3);

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score


    init{
        bookCount()
    }

    fun bookCount(){
        _score.value = (score.value)?.minus(1)

    }

    private fun resetList() {
        val count1 = booklist1.get(1)
        if (count1 == 0){

        }
    }


}