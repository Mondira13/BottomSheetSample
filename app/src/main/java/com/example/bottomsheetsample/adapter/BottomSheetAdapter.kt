package com.example.bottomsheetsample.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomsheetsample.R
import com.example.bottomsheetsample.model.Months
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView


class BottomSheetAdapter(private var months: List<Months>, private var activity: Activity) :
    RecyclerView.Adapter<BottomSheetAdapter.BottomSheetViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BottomSheetViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.month_list_child, parent, false)
        return BottomSheetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BottomSheetViewHolder, position: Int) {
        val monthModel = months[position]
        holder.itemView.findViewById<TextView>(R.id.monthName).text = monthModel.monthName

        monthModel.icon.let {

            Picasso.with(activity).load(monthModel.icon).into(holder.itemView.findViewById<CircleImageView>(R.id.icon))

        }


    }

    override fun getItemCount(): Int {
        return months.size
    }

    inner class BottomSheetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         val mMonthName: TextView ? = null
    }


}
