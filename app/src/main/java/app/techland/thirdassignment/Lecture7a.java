package app.techland.thirdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import app.techland.thirdassignment.databinding.ActivityLecture7aBinding;

public class Lecture7a extends AppCompatActivity {

    ActivityLecture7aBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLecture7aBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.mTV.setText("Yes This is Lecture 7a");
        String mStr1 = binding.mTV.getText().toString();
        Toast.makeText(this, mStr1, Toast.LENGTH_SHORT).show();

    }

    public void buttonClicked(View view) {

        String mStr2 = binding.mET.getText().toString().trim();
        Toast.makeText(this, mStr2, Toast.LENGTH_SHORT).show();
    }


    public void MoveOn(View view) {
        startActivity(new Intent(getApplicationContext(),Lecture7b.class));
    }
}