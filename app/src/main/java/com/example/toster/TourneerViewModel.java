package com.example.toster;

import android.widget.ImageView;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Arrays;
import java.util.List;

public class TourneerViewModel extends ViewModel {
    private MutableLiveData<List<String>> _users = new MutableLiveData<>(Arrays.asList());// для Model
    public LiveData<List<String>> users  = _users;

    private MutableLiveData<ImageView> _image = new MutableLiveData<>();
    public LiveData<ImageView> image = _image;



    public void set_users(List<String> _users) {
        this._users.setValue(_users);
    }



}
