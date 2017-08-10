package firstapp.com.poc_app_first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

//import main.java.com.poc_lib.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainapp);


        Intent intent = new Intent(MainActivity.this, main.java.com.poc_lib.Activity.class);
        startActivity(intent);


         Log.e("POC_PAKAGE","package name:- "+getApplicationContext().getPackageName());

    }
}
