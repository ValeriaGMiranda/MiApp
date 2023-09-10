package com.valesoft.miapp.ui.home;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends AndroidViewModel {

    private Context context;
    private MutableLiveData<String> mLlamada;

    public HomeViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }

    public LiveData<String> getMLlamada(){
        if(mLlamada == null){
          mLlamada = new MutableLiveData<>();
        }
        return mLlamada;
    }

    public void hacerLlamada(String numero){
        if(numero.matches("[0-9]+")&& numero.length()>0){
            mLlamada.setValue(numero);
        }else{
            Toast.makeText(context, "Se ingresó una cadena vacía ó un digito no es número", Toast.LENGTH_SHORT).show();
        }
    }
}