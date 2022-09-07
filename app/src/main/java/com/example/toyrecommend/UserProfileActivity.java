package com.example.toyrecommend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class UserProfileActivity extends AppCompatActivity {

    private EditText parentName, childName, childAge, homeAddress;
    private Spinner gender;
    private Button saveDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        parentName = (EditText) findViewById(R.id.parent_name);
        childName = (EditText) findViewById(R.id.child_name);
        gender = (Spinner) findViewById(R.id.child_gender);
        childAge = (EditText) findViewById(R.id.child_age);
        homeAddress = (EditText) findViewById(R.id.user_address);
        saveDetails = (Button) findViewById(R.id.confirm_user_details);

        saveDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveUserProfile();
            }
        });

    }

    private void saveUserProfile() {

    }
}