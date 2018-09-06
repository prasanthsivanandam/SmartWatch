package sample.cse.mcet.com.smartwatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void onClick1(View view){

        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);

    }
    public void onClick2(View view){

        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
