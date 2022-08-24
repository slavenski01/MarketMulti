package me.vkuznetsov.androidApp.view

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import me.vkuznetsov.shared.base.ViewMP

class RestrictionView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : TextView(context, attrs, defStyleAttr), ViewMP {

    override fun show() {
        visibility = VISIBLE
    }

    override fun hide() {
        visibility = GONE
    }
}