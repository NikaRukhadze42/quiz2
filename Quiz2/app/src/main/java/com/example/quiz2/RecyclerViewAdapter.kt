package com.example.quiz2


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recyclerview_layout.view.*

class RecyclerViewAdapter(private val items: MutableList<UserModel>):
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recyclerview_layout, parent, false)
        )

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind()
        holder.itemView.changeButton.setOnClickListener{

        }
        holder.itemView.removeButton.setOnClickListener{

        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private lateinit var model: UserModel

        fun onBind()
        {
            model = items[adapterPosition]
            itemView.textViewName.text = model.name
            itemView.textViewSurName.text = model.surName
            itemView.textViewMail.text = model.mail
        }
    }

}