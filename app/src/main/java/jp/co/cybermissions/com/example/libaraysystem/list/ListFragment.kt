package jp.co.cybermissions.com.example.libaraysystem.list

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import jp.co.cybermissions.com.example.libaraysystem.MainFragment.Companion.TAG
import jp.co.cybermissions.com.example.libaraysystem.databinding.FragmentBookListBinding


class ListFragment : Fragment() {

    private val viewModel: ListViewModel by lazy {
        ViewModelProvider(this).get(ListViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBookListBinding.inflate(inflater)
        binding.listViewModel = viewModel


        binding.recyclerView.adapter = BookGridAdapter(BookGridAdapter.OnClickListener {
            viewModel.displayPropertyDetails(it)
            Log.i(TAG, "Binding")
        })


        viewModel.navigateToSelectedProperty.observe(this, Observer {
            if (null != it) {
                this.findNavController().navigate(
                    ListFragmentDirections.actionListFragmentToDetailFragment(it)
                )
                Log.i(TAG, "Book name")
                viewModel.displayPropertyDetailsComplete()
            }
        })

        return binding.recyclerView.rootView
    }
}