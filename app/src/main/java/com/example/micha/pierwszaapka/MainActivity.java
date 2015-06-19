package com.example.micha.pierwszaapka;
/**
 * Autorzy
 *
 * Magdalena Kaniewska
 * Michał Michalak
 * Hubert Scibor
 *
 * Wosjkowa Akademia Techniczna
 * Grupa E2C2S1
 *
 * Laboratorium Programowanie Urządzeń Mobilnych
 *
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    //------ DEKLARACJA LOGINU I HASLA ------//
    public static final String LOG = "admin";
    public static final String PASS = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void logInOnClick(View view) {

        //------ LOGOWANIE BEZ HASLA DLA POTRZEB TESTOW ------//

//        Intent intent = new Intent(this, MenuActivity.class);
//        startActivity(intent);



        EditText logowanie = (EditText) findViewById(R.id.editText2);
        String LOGIN = logowanie.getText().toString();

        EditText logowanie2 = (EditText) findViewById(R.id.editText);
        String PASSWORD = logowanie2.getText().toString();

        if (LOGIN.equals(LOG)) {
            if (PASSWORD.equals(PASS)) {
                Intent intent = new Intent(this, MenuActivity.class);
                startActivity(intent);
            }
            else {
                Context context = getApplicationContext();
                Toast.makeText(context, getString(R.string.bladhaslamain), Toast.LENGTH_LONG).show();
            }
        }
        else{
            Context context = getApplicationContext();
            Toast.makeText(context, getString(R.string.bladhaslailoginumain), Toast.LENGTH_LONG).show();

        }
    }
}
