package org.techtown.databinding_ex1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.techtown.databinding_ex1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Cat cat = new Cat("야옹이", 3, "흰색");
        binding.setCat(cat);
    }

    public void goSecondActivity(View v) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(intent);
    }

    public void printCat(Cat cat) {
        Log.d("tag", "Cat name: " + cat.name + "Cat age: " + cat.age);
    }
}