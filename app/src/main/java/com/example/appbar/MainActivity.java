package com.example.appbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        Button gotoChild=(Button) findViewById(R.id.gotochild);
        Intent childActivity=new Intent(this, ChildActivity.class);
        gotoChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(childActivity);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                //user chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_favorite:
                //user chose the "Favorite" action, mark the current item
                //as a favorite
                return true;

            default:
                //if we got here, the user's action not recognized
                //invoke the superclass to handle it
                return super.onOptionsItemSelected(item);
        }
    }
}