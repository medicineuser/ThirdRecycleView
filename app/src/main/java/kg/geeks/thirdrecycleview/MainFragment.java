package kg.geeks.thirdrecycleview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    private Button nextBtn;
    private RecyclerView rvCars;
    private ArrayList<String> carList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        initListener();
        CarAdapter carAdapter = new CarAdapter(carList);
        rvCars.setAdapter(carAdapter);
    }

    private void initListener() {

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new SecondFragment()).commit();
            }
        });

    }

    private void loadData() {
        carList.add("BMW");
        carList.add("Tesla");
        carList.add("Mers");
        carList.add("Audi");
        carList.add("Toyota");
        carList.add("Volvo");
        carList.add("BMW");
        carList.add("Tesla");
        carList.add("Mers");
        carList.add("Audi");
        carList.add("Toyota");
        carList.add("Volvo");

    }

    private void initView(){
        rvCars = requireActivity().findViewById(R.id.rv_cars);
        nextBtn = requireActivity().findViewById(R.id.nextBtn);
    }
}