package com.brizly.todoinglist

data class Todo(
    val title: String,
    var isChecked: Boolean = false
)