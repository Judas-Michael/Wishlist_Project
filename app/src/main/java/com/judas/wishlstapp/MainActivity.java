package com.judas.wishlstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button newWishListButton;
    Button searchListButton;
    EditText addEmailEditText;
    ListView wishlistListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newWishListButton = (Button) findViewById(R.id.add_list_button);
        searchListButton = (Button) findViewById(R.id.search_list_button);
        addEmailEditText = (EditText) findViewById(R.id.add_email_et);
        wishlistListView = (ListView) findViewById(R.id.wishlist_listview);

        newWishListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this,wishlist_add.class);
                startActivity(myIntent);
                          }

});
    }
}