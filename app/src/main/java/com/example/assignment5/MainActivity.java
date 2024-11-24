package com.example.assignment5;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recycler_view);

        // Use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Initialize data
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Apple", 1.99));
        productList.add(new Product("Banana", 0.99));
        productList.add(new Product("Orange", 2.49));
        productList.add(new Product("Avocado", 3.49));
        productList.add(new Product("Mango", 1.49));
        productList.add(new Product("Grape", 2.65));
        productList.add(new Product("Kiwi", 2.99));

        // Specify the adapter
        adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);
    }
}