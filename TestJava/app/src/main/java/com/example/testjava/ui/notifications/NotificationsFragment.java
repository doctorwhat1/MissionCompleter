package com.example.testjava.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.testjava.R;
import com.example.testjava.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


//        Button goToCustomizeActivity = (Button)findViewById(R.id.changeInfoBTN);
        Button goToCustomizeActivity = binding.goCustomizeBTN;
        goToCustomizeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(this, com.example.testjava.ui.notifications.CustomizeProfileActivity.class);
            }
        });
        return root;
    }

    private void startActivity(View.OnClickListener onClickListener, Class<CustomizeProfileActivity> customizeProfileActivityClass) {
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}