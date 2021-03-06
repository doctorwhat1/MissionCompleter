package com.example.testjava.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.testjava.MainActivity;
import com.example.testjava.R;
import com.example.testjava.databinding.FragmentNotificationsBinding;
import com.example.testjava.ui.RegistryActivity;

public class NotificationsFragment extends Fragment {


    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        // go to changeProfile button.

        Button goToCustomizeActivity = binding.goCustomizeBTN;

        goToCustomizeActivity.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Intent intent1 = new Intent(getContext(), CustomizeProfileActivity.class);
            startActivity(intent1);
            }
         });

//        Button goToCustomizeActivity = (Button)findViewById(R.id.changeInfoBTN);
//        Button goToCustomizeActivity = binding.goCustomizeBTN;
//        goToCustomizeActivity.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(this, CustomizeProfileActivity.class);
//            }
//        });
        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}