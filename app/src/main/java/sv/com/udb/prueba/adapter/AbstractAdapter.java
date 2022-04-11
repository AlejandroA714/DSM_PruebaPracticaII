package sv.com.udb.prueba.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sv.com.udb.prueba.interfaces.OnItemClickListener;

abstract class AbstractAdapter<T,K extends AbstractViewHolder> extends RecyclerView.Adapter<K> {

    private List<T> payload;
    private final OnItemClickListener<T> onItemClickListener;

    public AbstractAdapter(List<T> payload){
        this(payload,null);
    }

    public AbstractAdapter(List<T> payload, OnItemClickListener<T> onItemClickListener){
        this.payload = payload;
        this.onItemClickListener = onItemClickListener;
    }

    public void update(List<T> payload){
        this.payload = payload;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull K holder, int position) {
        holder.bind(payload.get(position),position,onItemClickListener);
    }

    @Override
    public int getItemCount() {
        return payload.size();
    }

}
