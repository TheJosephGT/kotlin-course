package com.example.jetpackcomposecatalog2.ui.theme

data class CheckInfo(val title:String, var selected:Boolean = false, var onCheckedChange: (Boolean) -> Unit) {
}