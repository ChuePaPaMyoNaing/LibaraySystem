package jp.co.cybermissions.com.example.libaraysystem


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import jp.co.cybermissions.com.example.libaraysystem.book.Book
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var button: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Up button
        val navController = this.findNavController(R.id.nav_host_fragment)
        NavigationUI.setupActionBarWithNavController(this,navController)

        val assetManager = resources.assets //アセット呼び出し
        val inputStream = assetManager.open("books_list.json") //Jsonファイル
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        val jsonText: String = bufferedReader.readText() //データ
        Log.d("json",jsonText)

        val listBookType = Types.newParameterizedType(List::class.java, Book::class.java)
        val adapter: JsonAdapter<List<Book>> = Moshi.Builder().build().adapter(listBookType)
        val detail: List<Book>? = adapter.fromJson(jsonText)
        Log.d("json2",detail.toString())
        //inputStream.close()

    }
    //Up button
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.nav_host_fragment)
        return navController.navigateUp()
    }
}