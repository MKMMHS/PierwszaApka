package com.example.micha.pierwszaapka;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class EditProfileActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edit_profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //potwierdz edycje
    public void acceptEdit(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
                startActivity(intent);


//        EditText logowanie2 = (EditText) findViewById(R.id.editText4);
//        String PASSWORD1 = logowanie2.getText().toString();
//
//        EditText logowanie3 = (EditText) findViewById(R.id.editText4);
//        String PASSWORD2 = logowanie3.getText().toString();
//
//
//            if (PASSWORD1.equals(PASSWORD2)) {
//
//                Context context = getApplicationContext();
//                Toast.makeText(context, "Hasla zostaly wprowadzone poprawnie :)", Toast.LENGTH_LONG).show();
//
//                Intent intent = new Intent(this, MenuActivity.class);
//                startActivity(intent);
//            }
//            else {
//                Context context = getApplicationContext();
//                Toast.makeText(context, "Podane hasla nie s¹ zgodne, sprobuj ponownie.", Toast.LENGTH_LONG).show();
//            }
//
        }



    }

