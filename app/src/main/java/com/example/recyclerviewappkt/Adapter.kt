package com.example.recyclerviewappkt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView

class Adapter(val context: Context,var arrayList: ArrayList<Model>) : RecyclerView.Adapter<Adapter.ViewHolder>() {



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contactImg = itemView.findViewById<ImageView>(R.id.profileImg)
        val contactNo = itemView.findViewById<TextView>(R.id.numberTxt)
        val contactName = itemView.findViewById<TextView>(R.id.contactNameTv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false))
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.contactImg.setImageResource(arrayList[position].img)
        holder.contactName.text=arrayList[position].name
        holder.contactNo.text = arrayList[position].number
    }
}