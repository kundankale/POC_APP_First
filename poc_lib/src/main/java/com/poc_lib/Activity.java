package main.java.com.poc_lib;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.poc_lib.R;


/**
 * Created by xcaluser on 4/4/17.
 */

public class Activity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(Activity.this, "clicked ", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Activity.this,Second.class);
                startActivity(intent);



            }
        });

    }
}
