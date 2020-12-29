package jp.co.cybermissions.com.example.libaraysystem.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.cybermissions.com.example.libaraysystem.book.Book
import jp.co.cybermissions.com.example.libaraysystem.databinding.FragmentDetailBinding

class BookGridAdapter (private val onClickListener: OnClickListener): ListAdapter<Book,
        BookGridAdapter.BookViewHolder>(DiffCallback) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BookViewHolder {
        return BookViewHolder(
            FragmentDetailBinding.inflate(
                LayoutInflater.from(parent.context)
            )
        )
    }
    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = getItem(position)
        holder.itemView.setOnClickListener {
            onClickListener.onClick(book)
        }
        holder.bind(book)
    }
    companion object DiffCallback : DiffUtil.ItemCallback<Book>() {
        override fun areItemsTheSame(oldItem: Book, newItem: Book): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Book, newItem: Book): Boolean {
            return oldItem.name == newItem.name
        }
    }

    class BookViewHolder(
        private var binding:
        FragmentDetailBinding
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(book: Book) {
            binding.property = book
            binding.executePendingBindings()
        }
    }

    class OnClickListener(val clickListener: (book: Book) -> Unit) {
        fun onClick(book: Book) = clickListener(book)
    }
}

