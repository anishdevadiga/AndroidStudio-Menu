package com.example.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);  // Ensure that 'menu_items' is the correct menu resource file name
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String str = Objects.requireNonNull(item.getTitle()).toString();
        switch (str) {
            case "Toast":
                Toast.makeText(MainActivity.this, "Clicked Toast", Toast.LENGTH_SHORT).show();
                return true;
            case "President":
                Intent newIntent = new Intent(MainActivity.this, president.class);
                startActivity(newIntent);
            case "Exit":
                finishAffinity();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
