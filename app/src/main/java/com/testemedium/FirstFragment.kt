package com.o.testemedium

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.testemedium.ContactsAdapter
import com.testemedium.model.Contact
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        val layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        val adapter = ContactsAdapter()
        adapter.setItems(mockContactsList())
        recycler.adapter = adapter
        recycler.layoutManager = layoutManager
    }

    private fun mockContactsList(): List<Contact> {
        return listOf(
            Contact(
                "Bruna Esteves", "Android Developer", "Android Developer since 2012.\n" +
                        "Find a plan to solve a problem, design and develop mobile applications with great technical quality and refined design, following the guidelines set by Google.",
                R.drawable.person_girl_flat
            ),
            Contact(
                "William Gustavo",
                "GPM",
                "Manage the product throughout the Product Lifecycle, gathering and prioritizing product and customer requirements, defining the product vision, and working closely with engineering, to deliver winning products.",
                R.drawable.person_flat
            ),
            Contact(
                "Diego Ramos",
                "Tech Lead",
                "responsible for managing technical aspects of software development flow in a specific context or team. It's crucial to a good tech lead to ensure the success of delivered solutions. In other words, tech leads are software engineers that enable the team to work with quality",
                R.drawable.person_flat
            ),
        )
    }
}