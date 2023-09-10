package com.valesoft.miapp.ui.salir;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.valesoft.miapp.Dialogos;
import com.valesoft.miapp.MainActivity;
import com.valesoft.miapp.R;
import com.valesoft.miapp.databinding.FragmentHomeBinding;
import com.valesoft.miapp.databinding.FragmentSalirBinding;

public class SalirFragment extends Fragment {

    private FragmentSalirBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSalirBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.bCerr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialogos.mostrarDialogo(getActivity());
            }
        });

        return root;
    }


}