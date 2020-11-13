package com.example.android_7_activitypost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TV_show();
    }
    public void send(View v) {
        final EditText minput = findViewById(R.id.ET_input);
        Intent intent = new Intent(this, Activity_Post2.class);
        Bundle bundle = new Bundle();
        bundle.putString("key",minput.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void TV_show(){
        final TextView mvalue = findViewById(R.id.TV_value);
        Bundle bundle = this.getIntent().getExtras();
        if(bundle != null) {
            String key = bundle.getString("key2");
            mvalue.setText(key);
        }
    }
}