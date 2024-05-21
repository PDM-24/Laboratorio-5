package com.falconteam.laboratorio_5.utils

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BlogsitoViewModel : ViewModel() {
    private var _title by mutableStateOf("Título de muestra")
    private var _postDescription by mutableStateOf("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean accumsan nec justo non finibus. Morbi venenatis eu nulla ut laoreet. Sed id justo vitae libero maximus interdum. Pellentesque eget ullamcorper nisi. Donec vel tempor nisi. Integer fermentum bibendum blandit. Maecenas eleifend placerat porttitor. Sed erat est, sollicitudin ut ultrices et, cursus et nulla. Duis molestie magna ipsum, sit amet scelerisque libero luctus ut. Sed elit augue, pretium sit amet pellentesque nec, tempor vitae eros.")

    val title get() = _title
    val postDescription get() = _postDescription

    fun setTitle(title: String) {
        _title = title
    }

    fun setDescription(description: String) {
        _postDescription = description
    }

}