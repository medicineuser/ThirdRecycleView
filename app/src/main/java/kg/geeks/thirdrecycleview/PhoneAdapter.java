package kg.geeks.thirdrecycleview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneViewHolder> {

    private ArrayList<String> phoneList;

    public PhoneAdapter(ArrayList<String> phoneList) {
        this.phoneList = phoneList;
    }

    @NonNull
    @Override
    public PhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PhoneViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneViewHolder holder, int position) {
        holder.onBind(phoneList.get(position));
    }

    @Override
    public int getItemCount() {
        return phoneList.size();
    }
}
