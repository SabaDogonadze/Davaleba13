package com.example.davaleba13

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.davaleba13.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private var parentItem = mutableListOf<ParentItem>()
    private var items1 = mutableListOf<DataSubListItem>()
    private var items2 = mutableListOf<DataSubListItem>()
    private var items3 = mutableListOf<DataSubListItem>()
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: ItemsRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setItemsData()
        setUpItemsRecycler()
        setupRegisterButton()
    }

    private fun setUpItemsRecycler() {
        adapter = ItemsRecyclerAdapter()
        binding.ParentRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.ParentRecyclerView.adapter = adapter
        adapter.submitList(parentItem)


    }

    private fun setupRegisterButton() {
        binding.btnRegister.setOnClickListener {
                // Naah I Dont Know How Set ClickListener
        }
    }




    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun setItemsData() {

        items1.also {

            it.add(
                DataSubListItem(
                    field_id = 1,
                    field_type = "input",
                    hint = "UserName",
                    icon = "https://jemala.png",
                    is_active = true,
                    icon1 = R.drawable.email,
                    keyboard = "text",
                    required = false

                )
            )
            it.add(
                DataSubListItem(
                    field_id = 2,
                    field_type = "input",
                    hint = "Email",
                    icon = "https://jemala.png",
                    icon1 = R.drawable.cake,
                    is_active = true,
                    keyboard = "text",
                    required = true

                )
            )

            it.add(
                DataSubListItem(
                    field_id = 3,
                    field_type = "input",
                    hint = "Phone",
                    icon = "https://jemala.png",
                    icon1 = R.drawable.phone,
                    is_active = true,
                    keyboard = "text",
                    required = true

                )
            )

        }

        items2.also {
            it.add(
                DataSubListItem(
                    field_id = 4,
                    field_type = "input",
                    hint = "FullName",
                    icon = "https://jemala.png",
                    icon1 = R.drawable.person,
                    is_active = true,
                    keyboard = "text",
                    required = true

                )
            )
            it.add(
                DataSubListItem(
                    field_id = 14,
                    field_type = "input",
                    hint = "Jemali",
                    icon = "https://jemala.png",
                    icon1 = R.drawable.cake,
                    is_active = true,
                    keyboard = "text",
                    required = false

                )
            )
            it.add(
                DataSubListItem(
                    field_id = 89,
                    field_type = "chooser",
                    hint = "BirthDay",
                    icon = "https://jemala.png",
                    icon1 = R.drawable.person,
                    is_active = true,
                    keyboard = "text",
                    required = false

                )
            )
        }

        items3.also {

            it.add(
                DataSubListItem(
                    field_id = 898,
                    field_type = "chooser",
                    hint = "Gender",
                    icon = "https://jemala.png",
                    icon1 = R.drawable.email,
                    is_active = true,
                    keyboard = "text",
                    required = false

                )
            )
        }


        parentItem.also {
            it.add(
                ParentItem(
                    1,
                    mList = items1
                )

            )

            it.add(
                ParentItem(
                    2,
                    mList = items2
                )

            )

            it.add(
                ParentItem(
                    3,
                    mList = items3
                )

            )
        }

    }
}



