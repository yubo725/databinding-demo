package test.com.databindingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void demo1BtnClick(View view) {
        startActivity(new Intent(this, Demo1Activity.class));
    }

    public void demo2BtnClick(View view) {
        startActivity(new Intent(this, Demo2Activity.class));
    }
}
