package jp.co.cybermissions.com.example.libaraysystem.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import jp.co.cybermissions.com.example.libaraysystem.R
import jp.co.cybermissions.com.example.libaraysystem.databinding.FragmentListBinding


class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    private lateinit var viewModel: ListViewModel


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
//        val binding = DataBindingUtil.inflate<FragmentListBinding>(inflater,
//            R.layout.fragment_list,container,false)
        val binding: FragmentListBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_list, container, false)

        //viewModel
        viewModel = ViewModelProvider(this).get(ListViewModel::class.java)



        //binding.book1.setOnClickListener{bookDetail()}
       binding.book1.setOnClickListener{
           view: View -> view.findNavController().navigate(R.id.action_listFragment_to_detailFragment)
       }

        binding.book2.setOnClickListener{
            view: View -> view.findNavController().navigate(R.id.action_listFragment_to_detailFragment)
        }
        binding.book3.setOnClickListener{ view: View -> view.findNavController().navigate(R.id.action_listFragment_to_detailFragment)}
        binding.book4.setOnClickListener{ view: View -> view.findNavController().navigate(R.id.action_listFragment_to_detailFragment)}
        binding.book5.setOnClickListener{ view: View -> view.findNavController().navigate(R.id.action_listFragment_to_detailFragment)}

        return binding.root
    }

    }