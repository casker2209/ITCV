package itcv.vn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import itcv.vn.databinding.ItemGeninfoBinding;

public class GeneralInformationAdapter extends RecyclerView.Adapter<GeneralInformationAdapter.ViewHolder> {
    private List<GeneralInformation> list;

    public GeneralInformationAdapter(List<GeneralInformation> list){
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemGeninfoBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.item_geninfo,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.setGenInfo(list.get(position));
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
        ItemGeninfoBinding binding;
        public ViewHolder(@NonNull ItemGeninfoBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
