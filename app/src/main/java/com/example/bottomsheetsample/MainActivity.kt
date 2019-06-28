package com.example.bottomsheetsample

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bottomsheetsample.adapter.BottomSheetAdapter
import com.example.bottomsheetsample.model.Months
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.select_month_bottomsheet_layout.view.*

class MainActivity : Activity() {

    lateinit var monthList : ArrayList<Months>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setMonthListOnClicklistener()
    }

    private fun setMonthListOnClicklistener() {
        months.setOnClickListener {
            val dialog = BottomSheetDialog(this)
            val view = LayoutInflater.from(this@MainActivity).inflate(R.layout.select_month_bottomsheet_layout, null)
            dialog.setContentView(view)

            setMonthsNameInModel()
            view.monthRecyclerView.layoutManager = LinearLayoutManager(this)
            view.monthRecyclerView.adapter = BottomSheetAdapter(monthList, this)
            dialog.show()
        }
    }


    private fun setMonthsNameInModel() {
        monthList = ArrayList()
        monthList.add(
            Months(
                "January",
                "https://static.india.com/wp-content/uploads/2017/05/heavy-rain.jpg"
            )
        )
        monthList.add(
            Months(
                "February",
                "https://static.india.com/wp-content/uploads/2017/05/heavy-rain.jpg"
            )
        )
        monthList.add(
            Months(
                "March",
                "https://static.india.com/wp-content/uploads/2017/05/heavy-rain.jpg"
            )
        )
        monthList.add(
            Months(
                "April",
                "https://static.india.com/wp-content/uploads/2017/05/heavy-rain.jpg"
            )
        )
        monthList.add(
            Months(
                "May",
                "https://static.india.com/wp-content/uploads/2017/05/heavy-rain.jpg"
            )
        )
        monthList.add(
            Months(
                "June",
                "https://static.india.com/wp-content/uploads/2017/05/heavy-rain.jpg"
            )
        )
        monthList.add(
            Months(
                "July",
                "https://static.india.com/wp-content/uploads/2017/05/heavy-rain.jpg"
            )
        )
        monthList.add(
            Months(
                "Auguest",
                "https://static.india.com/wp-content/uploads/2017/05/heavy-rain.jpg"
            )
        )
        monthList.add(
            Months(
                "September",
                "https://static.india.com/wp-content/uploads/2017/05/heavy-rain.jpg"
            )
        )
        monthList.add(
            Months(
                "October",
                "https://static.india.com/wp-content/uploads/2017/05/heavy-rain.jpg"
            )
        )
        monthList.add(
            Months(
                "November",
                "https://static.india.com/wp-content/uploads/2017/05/heavy-rain.jpg"
            )
        )
        monthList.add(
            Months(
                "December",
                "https://static.india.com/wp-content/uploads/2017/05/heavy-rain.jpg"
            )
        )

    }

}


