package com.example.davaleba13

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.davaleba13.databinding.FragmentMainBinding


class MainFragment : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {

    private var parentItem = mutableListOf<ParentItem>()
    private lateinit var adapter: ItemsRecyclerAdapter
    private val viewModel: ItemsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.parentItemList.observe(viewLifecycleOwner) { parentItemList ->
            adapter.submitList(parentItemList)
        }

        setUpItemsRecycler()
        clickListeners()
        viewModel.setItemsData()
    }

    override fun setUpItemsRecycler() {
        adapter = ItemsRecyclerAdapter()
        binding.ParentRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.ParentRecyclerView.adapter = adapter

    }

    override fun clickListeners() {
        binding.btnRegister.setOnClickListener {

        }

    }





}



