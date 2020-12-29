package jp.co.cybermissions.com.example.libaraysystem.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import jp.co.cybermissions.com.example.libaraysystem.R
import jp.co.cybermissions.com.example.libaraysystem.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var viewModel: DetailViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentDetailBinding>(inflater,
                R.layout.fragment_detail, container, false)
        viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)

        binding.detailViewModel = viewModel


        binding.rentButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_detailFragment_to_mainFragment)
            Toast.makeText(activity, "Book is Rented", Toast.LENGTH_SHORT).show()
        }
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }
}