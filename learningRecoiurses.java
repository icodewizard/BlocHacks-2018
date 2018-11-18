package com.example.marwan.unhcr;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class learningRecoiurses extends AppCompatActivity implements View.OnClickListener {
    Button khanAcademy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_recoiurses);
        khanAcademy = (Button) findViewById(R.id.khanAcademy);
        khanAcademy.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.khanAcademy:
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.khanacademy.org"));
                startActivity(intent);
                break;
        }
    }
}
