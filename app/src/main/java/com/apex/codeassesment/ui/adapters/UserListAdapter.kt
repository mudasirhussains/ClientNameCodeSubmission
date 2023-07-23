package com.apex.codeassesment.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.apex.codeassesment.data.model.RemoteData
import com.apex.codeassesment.data.model.User

interface OnItemClickListener {
    fun onItemClick(user: User)
}

class UserListAdapter(private var userList: List<User>, private val itemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<UserListAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false)
        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.bind(user)
    }

    override fun getItemCount(): Int = userList.size

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            itemView.setOnClickListener { itemClickListener.onItemClick(user) }
            (itemView as TextView).text = user.toString()
        }
    }
}

