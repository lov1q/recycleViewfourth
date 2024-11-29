package com.example.recycleviewfourth

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter(private val dataSet: List<Employee>): RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.FIOTextView)
        val imageSource: ImageView = view.findViewById(R.id.imageEmployee)
        val rating: TextView = view.findViewById(R.id.rating)
        val lineWriting: TextView = view.findViewById(R.id.linewtriting)
        val projectCount: TextView = view.findViewById(R.id.projectcount)
        val teamName: TextView = view.findViewById(R.id.teamname)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recycleview_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = dataSet[position].name
        holder.imageSource.setImageResource(dataSet[position].imageSource)
        holder.rating.text = "${dataSet[position].rating}\nРейтинг"
        holder.lineWriting.text = "${dataSet[position].lineWriting}\nНаписано строк кода"
        holder.projectCount.text = "${dataSet[position].projectCount}\nПроектов"
        holder.teamName.text = "Команда: ${dataSet[position].teamName}"

    }

    override fun getItemCount() = dataSet.size
}