package com.example.testjava.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testjava.R;
import com.example.testjava.databinding.FragmentDashboardBinding;
import com.example.testjava.databinding.FragmentHomeBinding;
import com.example.testjava.ui.MyAdapter;
import com.example.testjava.ui.MyAdapter2;
import com.example.testjava.ui.home.HomeViewModel;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;


    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    String s1[], s2[], s3[];
    int images[] = {R.drawable.person_100};




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        final TextView textView = binding.textDashboard;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = binding.recyclerView;
        RecyclerView recyclerView2 = binding.recyclerView2;

        s1 = getResources().getStringArray(R.array.mentor_names);
        s2 = getResources().getStringArray(R.array.mentor_descriptions);
        s3 = getResources().getStringArray(R.array.mentor_category);

        MyAdapter myAdapter = new MyAdapter(getContext(), s1, s2, s3, images);
        MyAdapter2 myAdapter2 = new MyAdapter2(getContext(), s1, s2, s3, images);


        recyclerView.setAdapter(myAdapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView2.setAdapter(myAdapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}