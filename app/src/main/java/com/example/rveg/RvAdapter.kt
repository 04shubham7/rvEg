package com.example.rveg

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.rveg.databinding.RvRow1Binding

class RvAdapter(var context: Context,var datax:ArrayList<data>):RecyclerView.Adapter<RvAdapter.ViewHolder>(){
    inner class ViewHolder(val binding:RvRow1Binding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding=RvRow1Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return datax.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val current = datax[position]
        holder.binding.tv1.text=current.sname
        holder.binding.tv2.text=current.snum.toString()
        holder.binding.iv1.setImageResource(current.simg)
        holder.binding.iv1.setOnClickListener {
            Toast.makeText(context,"Image"+position,Toast.LENGTH_LONG).show()
        }
        holder.binding.cv1.setOnClickListener {
            Toast.makeText(context,"layout"+position,Toast.LENGTH_LONG).show()
        }


    }
}
