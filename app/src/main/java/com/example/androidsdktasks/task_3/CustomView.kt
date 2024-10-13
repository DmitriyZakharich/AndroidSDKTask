package com.example.androidsdktasks.task_3

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.util.Random

/**Реализовать небольшую кастомную вью в виде прямоугольника.
При каждом нажатии на него он заполняется на 10%, цвет
залитой части рандомно меняется. При достижении 100% все начинается заново.*/

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr), View.OnClickListener {

    init {
        setOnClickListener(this)
    }

    private var fillPercentage = 0
    private val step = 10

    private val paintFill: Paint = Paint().apply {
        style = Paint.Style.FILL
    }

    private val paintStroke: Paint = Paint().apply {
        color = Color.RED
        style = Paint.Style.STROKE
        strokeWidth = 10f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val width = width.toFloat()
        val height = height.toFloat()

        canvas.drawRect(0f, 0f, width, height, paintStroke)
        canvas.drawRect(0f, 0f, width * fillPercentage / 100, height, paintFill)
    }

    override fun onClick(v: View?) {
        fillPercentage += step

        if (fillPercentage > 100)
            fillPercentage = 0

        paintFill.color = getRandomColor()
        invalidate()
    }

    private fun getRandomColor(): Int {
        val random = Random()
        return Color.argb(
            255,
            random.nextInt(256),
            random.nextInt(256),
            random.nextInt(256)
        )
    }
}
