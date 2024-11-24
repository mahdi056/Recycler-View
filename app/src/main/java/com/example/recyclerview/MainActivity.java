package com.example.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Item> itemList = new ArrayList<>();

        String[] laptopNames = {
                "Dell XPS 13", "HP Spectre x360", "MacBook Air", "Lenovo ThinkPad X1",
                "Asus ZenBook", "Microsoft Surface Laptop", "Acer Swift 3",
                "Razer Blade Stealth", "Samsung Galaxy Book", "LG Gram"
        };

        int[] laptopImages = {
                R.drawable.dell, R.drawable.hp, R.drawable.asus,
                R.drawable.lenovo, R.drawable.asus, R.drawable.laptop,
                R.drawable.asus, R.drawable.laptop,
                R.drawable.lenovo, R.drawable.dell
        };

        for (int i = 0; i < laptopNames.length; i++) {
            itemList.add(new Item(
                    laptopNames[i],           // Laptop name
                    500 + (i * 100),          // Laptop price, dynamically calculated
                    laptopImages[i]           // Laptop image resource
            ));
        }

        ItemAdapter adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }
}
