package com.testemedium

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.o.testemedium.R
import com.testemedium.model.Contact

class ContactsAdapter : RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    var contactList : MutableList<Contact> = mutableListOf()

    class ViewHolder(val view: ContactCardView) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.view_recycler_item, parent, false) as ContactCardView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact: Contact = contactList[position]
        val view = holder.view

        view.bind(contact)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    fun setItems(list: List<Contact>) {
        contactList = list.toMutableList()
        notifyDataSetChanged()
    }
}