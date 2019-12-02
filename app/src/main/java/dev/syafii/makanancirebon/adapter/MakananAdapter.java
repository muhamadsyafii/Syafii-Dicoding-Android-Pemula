package dev.syafii.makanancirebon.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import dev.syafii.makanancirebon.data.model.Makanan;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ListViewHolder> {

    public interface onItemClickCallback{
        void onItemClicked(Makanan data);
    }
    private onItemClickCallback onItemClickCallback;
    private ArrayList<Makanan> listMakan;

    public MakananAdapter(ArrayList<Makanan> listMakan){
        this.listMakan = listMakan;
        notifyDataSetChanged();
    }

    public void setOnItemClickCallback(onItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    @NonNull
    @Override
    public MakananAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate()
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MakananAdapter.ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
