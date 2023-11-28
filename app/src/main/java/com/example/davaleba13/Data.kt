package com.example.davaleba13

class Data : ArrayList<DataSubList>()

class DataSubList : ArrayList<DataSubListItem>()

data class DataSubListItem(
    val field_id: Int,
    val field_type: String,
    val hint: String,
    val icon1: Int,
    val icon: String,
    val is_active: Boolean,
    val keyboard: String,
    val required: Boolean
)