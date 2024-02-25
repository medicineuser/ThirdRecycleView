package kg.geeks.thirdrecycleview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ThirdFragment extends Fragment {

    private ArrayList<String> phoneList = new ArrayList<>();
    private RecyclerView rvPhones;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        addPhones();
        PhoneAdapter phoneAdapter = new PhoneAdapter(phoneList);
        rvPhones.setAdapter(phoneAdapter);
    }

    private void addPhones(){
        phoneList.add("Nokia");
        phoneList.add("Samsung");
        phoneList.add("Huawei");
        phoneList.add("LG");
        phoneList.add("Xiomi");

    }

    private void initView() {
        rvPhones = requireActivity().findViewById(R.id.rv_phones);
    }
}