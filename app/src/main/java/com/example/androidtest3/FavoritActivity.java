package com.example.androidtest3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.androidtest3.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class FavoritActivity extends AppCompatActivity {

    private ListView listViewFavoriter;
    private ArrayAdapter<Product> favoritAdapter;
    private List<Product> favoriter;
    private static final String LOG_TAG = FavoritActivity.class.getSimpleName();

    private void createFakedProducts() {
        favoriter = new ArrayList<>();
        Product p1 = new Product.Builder()
                .alcohol(4.4)
                .name("Pilsner Urquell")
                .nr(1234)
                .productGroup("Öl")
                .type("Öl")
                .volume(330).build();
        Product p2 = new Product.Builder()
                .alcohol(4.4)
                .name("Baron Trenk")
                .nr(1234)
                .productGroup("Öl")
                .type("Öl")
                .volume(330).build();
        favoriter.add(p1);
        favoriter.add(p2);
    }

    private void setupListView() {
        // look up a reference to the ListView object
        listViewFavoriter = findViewById(R.id.favorit_list);

        // create an adapter (with the faked products)
        favoritAdapter = new ArrayAdapter<Product>(this,
                android.R.layout.simple_list_item_1,
                favoriter);

        // Set listView's adapter to the new adapter
        listViewFavoriter.setAdapter(favoritAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorit);

        createFakedProducts();

        // setup listview (and friends)
        setupListView();

    }
}