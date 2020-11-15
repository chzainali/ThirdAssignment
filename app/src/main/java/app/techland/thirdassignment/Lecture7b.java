package app.techland.thirdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import app.techland.thirdassignment.databinding.ActivityLecture7bBinding;

public class Lecture7b extends AppCompatActivity {
 ActivityLecture7bBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLecture7bBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void ToggleBtn(View view) {
        if (binding.mToggleBtn.isChecked()){
            binding.mToggleBtn.setText("Toggle On");
            Toast.makeText(this, "On", Toast.LENGTH_SHORT).show();
        }else{
            binding.mToggleBtn.setText("Toggle Off");
            Toast.makeText(this, "Off", Toast.LENGTH_SHORT).show();
        }
    }

    public void MoveOn(View view) {
        startActivity(new Intent(getApplicationContext(),Lecture7c.class));
    }
}