package com.testemedium

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.card.MaterialCardView
import com.o.testemedium.R
import com.testemedium.model.Contact

open class ContactCardView
@JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : MaterialCardView(context, attrs, defStyleAttr) {

    protected lateinit var title: TextView
    protected lateinit var subtitle: TextView
    protected lateinit var description: TextView
    protected lateinit var img: ImageView


    override fun onFinishInflate() {
        super.onFinishInflate()

        title = findViewById(R.id.tvTitle)
        subtitle = findViewById(R.id.tvSubtitle)
        description = findViewById(R.id.tvDescription)
        img = findViewById(R.id.image)
    }

    open fun bind(contactItem : Contact){

        title.text = contactItem.name
        subtitle.text = contactItem.role
        description.text = contactItem.bio

        img.setImageDrawable(ContextCompat.getDrawable(context, contactItem.img))
    }
}