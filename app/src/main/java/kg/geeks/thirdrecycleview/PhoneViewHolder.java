package kg.geeks.thirdrecycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PhoneViewHolder extends RecyclerView.ViewHolder {
    private TextView tvPhone;
    public PhoneViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPhone = itemView.findViewById(R.id.tv_animal);
    }

    public void onBind(String phone){
        tvPhone.setText(phone);
    }
}
