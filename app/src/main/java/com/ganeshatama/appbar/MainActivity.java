package com.ganeshatama.appbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar) findViewById(R.id.topAppBar);
        setSupportActionBar(toolbar);
        }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.edit) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MenuFragment()).addToBackStack(null).commit();
            return true;
        }
        else if(item.getItemId()==R.id.favorite) {
            Toast.makeText(this, getString(R.string.favorite), Toast.LENGTH_LONG).show();
            return true;
        }
        else if(item.getItemId()==R.id.more) {
            Intent i = new Intent(this, MenuActivity.class);
            startActivity(i);
            return true;
        }
        else{
            return true;

        }
    }

}