package com.tour_guide.app.modules.cssscreen450homeone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tour_guide.app.R
import com.tour_guide.app.databinding.RowListrectanglethree1Binding
import com.tour_guide.app.modules.cssscreen450homeone.`data`.model.Listrectanglethree1RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglethreeAdapter(
  var list: List<Listrectanglethree1RowModel>
) : RecyclerView.Adapter<ListrectanglethreeAdapter.RowListrectanglethree1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglethree1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglethree1,parent,false)
    return RowListrectanglethree1VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglethree1VH, position: Int) {
    val listrectanglethree1RowModel = Listrectanglethree1RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglethree1RowModel = list[position]
    holder.binding.listrectanglethree1RowModel = listrectanglethree1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectanglethree1RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Listrectanglethree1RowModel
    ) {
    }
  }

  inner class RowListrectanglethree1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglethree1Binding = RowListrectanglethree1Binding.bind(itemView)
  }
}
