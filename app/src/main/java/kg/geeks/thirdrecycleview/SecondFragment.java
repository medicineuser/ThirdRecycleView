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

public class SecondFragment extends Fragment {

    private Button nextButton;
    private RecyclerView rvAnimals;
    private ArrayList<String> animalList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initListener();
        addAnimal();
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList);
        rvAnimals.setAdapter(animalAdapter);
    }
    private void addAnimal() {
        animalList.add("Lion");
        animalList.add("Tiger");
        animalList.add("Elephant");
        animalList.add("Panther");
        animalList.add("Dog");
        animalList.add("Bear");
    }
    private void initListener() {
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new ThirdFragment()).commit();
            }
        });
    }
    private void initView(){
        rvAnimals = requireActivity().findViewById(R.id.rv_animals);
        nextButton = requireActivity().findViewById(R.id.nextButton);
    }
}