package com.github.sevar83.kotlinx_unresolved_res

import android.view.View
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item.*

/**
 * Created by Svetlozar Kostadinov on 02.11.17.
 */
class ViewHolder(val itemView: View) : LayoutContainer {

    override val containerView: View?
        get() = itemView

    fun bind() {
        btn.text = "Hello KotlinX"
    }
}