package com.example.e_story;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button Babycakes=(Button)findViewById(R.id.Babycakes);
        Button War=(Button)findViewById(R.id.War);
        Button Ninny=(Button)findViewById(R.id.Ninny);
        Babycakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(Activity2.this,Activity3.class);
                startActivity(int1);
            }
        });
        War.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2=new Intent(Activity2.this,Activity4.class);
                startActivity(int2);
            }
        });
        Ninny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3=new Intent(Activity2.this,Activity5.class);
                startActivity(int3);
            }
        });
    }
}
