package app.techland.thirdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import app.techland.thirdassignment.databinding.ActivityLecture7cBinding;

public class Lecture7c extends AppCompatActivity {

    ActivityLecture7cBinding binding;
    Button mRBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLecture7cBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void CheckedBtn(View view) {
        GetValues(view);
    }

    public void GetValues(View v) {
        StringBuilder builder = new StringBuilder();
        if (binding.mCheck1.isChecked()) {
            String str1 = binding.mCheck1.getText().toString();
            builder.append(str1);
        }
        if (binding.mCheck2.isChecked()) {
            String str2 = binding.mCheck2.getText().toString();
            builder.append("\n" + str2);
        }
        if (binding.mCheck3.isChecked()) {
            String str3 = binding.mCheck3.getText().toString();
            builder.append("\n" + str3);
        }
        Toast.makeText(this, builder, Toast.LENGTH_SHORT).show();
    }

    public void RadioBtn(View view) {
        int select = binding.mRGroup.getCheckedRadioButtonId();
        mRBtn = findViewById(select);
        String string = mRBtn.getText().toString();
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}