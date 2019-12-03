package dev.syafii.makanancirebon.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import dev.syafii.makanancirebon.R;
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycleview, parent, false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MakananAdapter.ListViewHolder holder, int position) {
        Makanan makanan = listMakan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(makanan.getImage())
                .apply(new RequestOptions().override(55,55))
                .into(holder.img);
        holder.tvName.setText(makanan.getName());
        holder.tvPrice.setText(makanan.getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMakan.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMakan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tvName, tvPrice;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPrice = itemView.findViewById(R.id.tv_price);
        }
    }
}
