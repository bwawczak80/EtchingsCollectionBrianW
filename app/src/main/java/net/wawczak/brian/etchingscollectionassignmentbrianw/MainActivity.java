package net.wawczak.brian.etchingscollectionassignmentbrianw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
         Button btnEnter = findViewById(R.id.btnEnter);

         btnEnter.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, BookList.class);
                 startActivity(intent);
             }
         });
    }
}
