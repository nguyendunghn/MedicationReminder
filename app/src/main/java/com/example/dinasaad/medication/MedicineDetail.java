package com.example.dinasaad.medication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Dina Saad on 04-Nov-16.
 */
public class MedicineDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicine_details);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.detail_container, new MedicineDetail_fragment())
                    .commit();

        }
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);


        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();

        if (id == R.id.action_settings) {

            startActivity(new Intent(this, SettingActivity.class));

            return true;


        }

        return super.onOptionsItemSelected(item);
    }

    public void onclick(View view) {
    }

    public void onRadioButtonFreqClicked(View view) {
    }

    public void onClick(View view) {
    }
}
