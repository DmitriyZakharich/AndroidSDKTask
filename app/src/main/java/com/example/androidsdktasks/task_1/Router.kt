package com.example.androidsdktasks.task_1

import androidx.fragment.app.Fragment

interface Router {
    fun navigateToNext(fragment: Fragment)
    fun navigateToPrevious(fragment: Fragment)
}
