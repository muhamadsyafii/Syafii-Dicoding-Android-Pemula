package dev.syafii.makanancirebon.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ListViewHolder> {

    @NonNull
    @Override
    public MakananAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
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
