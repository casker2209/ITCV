package itcv.vn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import itcv.vn.databinding.ItemGeninfoBinding;
import itcv.vn.databinding.ItemSpecinfoBinding;

public class SpecializedInformationAdapter extends RecyclerView.Adapter<SpecializedInformationAdapter.ViewHolder> {
    private List<SpecializedInformation> list;

    public SpecializedInformationAdapter(List<SpecializedInformation> list){
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemSpecinfoBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.item_specinfo,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.setSpecInfo(list.get(position));
        holder.binding.remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.remove(list.get(position));
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemSpecinfoBinding binding;
        public ViewHolder(@NonNull ItemSpecinfoBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
