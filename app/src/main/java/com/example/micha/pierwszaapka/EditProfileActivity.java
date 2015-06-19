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
        getMenuInflater().inflate(R.menu.menu_edit_profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //potwierdz edycje
    public void acceptEdit(View view) {

        //------ POWROT DO MENU DLA POTRZEB TESTOW ------//

//        Intent intent = new Intent(this, MenuActivity.class);
//        startActivity(intent);


        EditText logowanie2 = (EditText) findViewById(R.id.editText4);
        String PASSWORD1 = logowanie2.getText().toString();

        EditText logowanie3 = (EditText) findViewById(R.id.editText4);
        String PASSWORD2 = logowanie3.getText().toString();


            if (PASSWORD1.equals(PASSWORD2)) {

                Context context = getApplicationContext();
                Toast.makeText(context, getString(R.string.prawidlowehasloeditprofile), Toast.LENGTH_LONG).show();

                Intent intent2 = new Intent(this, MenuActivity.class);
                startActivity(intent2);
            }
            else {
                Context context2 = getApplicationContext();
                Toast.makeText(context2, getString(R.string.bladhaslaeditprofile), Toast.LENGTH_LONG).show();
            }

        }



    }

