package com.example.wallpapercategory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class Homepage extends AppCompatActivity {

    private ImageButton signoutbtn;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        signoutbtn = findViewById(R.id.imageButton);



        mAuth = FirebaseAuth.getInstance();

        signoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();

                startActivity(new Intent(Homepage.this,LoginActivity.class));

                finish();
            }
        });




    }
}