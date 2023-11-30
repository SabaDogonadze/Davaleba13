// ItemsViewModel.kt
package com.example.davaleba13

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ItemsViewModel : ViewModel() {

    val parentItemList = MutableLiveData<List<ParentItem>>()

    fun setItemsData() {
        val parentItem = mutableListOf<ParentItem>()
        val items1 = mutableListOf<DataSubListItem>()
        val items2 = mutableListOf<DataSubListItem>()
        val items3 = mutableListOf<DataSubListItem>()

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
        parentItemList.value = parentItem
    }

    }

