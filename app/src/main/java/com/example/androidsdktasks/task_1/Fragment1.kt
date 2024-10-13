package com.example.androidsdktasks.task_1

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.androidsdktasks.R

/**Дано: Приложение с тремя экранами на базе Fragment, на каждом
экране есть 2 кнопки - для перехода на следующий экран и предыдущий.
Реализовать базовый роутер для навигации между фрагментами без
использования дополнительных библиотек.*/

class Fragment1 : Fragment(R.layout.fragment_1) {

    private val router by lazy {
        activity as? Router ?: throw IllegalStateException("Activity must implement Router")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_next).setOnClickListener {
            router.navigateToNext(Fragment2())
        }
    }
}
