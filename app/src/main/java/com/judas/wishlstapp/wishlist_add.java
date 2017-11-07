package com.judas.wishlstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by judas on 11/7/2017.
 */

public class wishlist_add extends AppCompatActivity {


    Button backButton;
    Button addWishlistItem;
    EditText itemAddText;
    EditText emailAddText;
    RadioButton isPurchased;
    RadioButton isNotPurchased;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_list_activity);

        backButton = (Button) findViewById(R.id.back_button);
        addWishlistItem = (Button) findViewById(R.id.add_item_button);
        itemAddText = (EditText) findViewById(R.id.wishlist_et);
        emailAddText = (EditText) findViewById(R.id.email_et);
        isPurchased = (RadioButton) findViewById(R.id.purchased_rb);
        isNotPurchased = (RadioButton) findViewById(R.id.notpurchased_rb);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(wishlist_add.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
}



