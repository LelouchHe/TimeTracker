package com.github.lelouchhe.timetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivCurrentTaskIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ivCurrentTaskIcon = this.findViewById(R.id.ivCurrentTaskIcon);

        ivCurrentTaskIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "current task icon click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
