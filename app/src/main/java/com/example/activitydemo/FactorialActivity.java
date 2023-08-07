package com.example.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FactorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);
    }

    public void fact(View view) {
        EditText t1=findViewById(R.id.txt1);
        EditText t2=findViewById(R.id.txt2);
        int n=Integer.parseInt(t1.getText().toString());
        int f=1;
        for(int i=1;i<n;i++)
        {
            f=f*i;


        }
        t2.setText("Fact="  +f);



    }
}