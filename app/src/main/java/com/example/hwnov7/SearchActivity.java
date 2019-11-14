package com.example.hwnov7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    EditText editTextZipCode2;
    Button buttonSearch, buttonGTR;
    TextView textViewBirdName, textViewPersonName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        editTextZipCode2 = findViewById(R.id.editTextZipCode2);
        buttonSearch = findViewById(R.id.buttonSearch);
        buttonGTR = findViewById(R.id.buttonGTR);
        textViewBirdName = findViewById(R.id.textViewBirdName);
        textViewPersonName = findViewById(R.id.textViewPersonName);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.searchMenu){
            Toast.makeText(this, "you are already on this page.", Toast.LENGTH_SHORT).show();

        } else if(item.getItemId() == R.id.reportMenu) {
            Intent searchIntent = new Intent(this, MainActivity.class);
            startActivity(searchIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}
