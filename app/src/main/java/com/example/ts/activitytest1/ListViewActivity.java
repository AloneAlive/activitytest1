package com.example.ts.activitytest1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private String[] data = {"Apple","Orange","Banana","Pear","Mango","Grape","Cherry","AKKO","GAOSI",
    "Good","Pencil","Pen","HuaWei","xiaomi","1+","Sony","Orange","Banana","Pear","Mango","Grape","Cherry","AKKO","GAOSI",
            "Good","Pencil","Pen","HuaWei","xiaomi","1+","Sony","Orange","Banana","Pear","Mango","Grape","Cherry","AKKO","GAOSI",
            "Good","Pencil","Pen","HuaWei","xiaomi","1+","Sony"};

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_layout);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(ListViewActivity.this, android.R.layout.simple_list_item_1, data);
        ListView listView = findViewById(R.id.list_view1);
        listView.setAdapter(adapter);
//        initFruits();  //初始化水果数据
//        FruitAdapter adapter = new FruitAdapter(ListViewActivity.this, R.layout.list_view_layout, fruitList);
//        ListView listView = findViewById(R.id.list_view1);
//        listView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i=0; i<2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.ic_launcher_background);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.drawable.ic_launcher_background);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange", R.drawable.ic_launcher_background);
            fruitList.add(orange);
            Fruit mango = new Fruit("Mango", R.drawable.ic_launcher_background);
            fruitList.add(mango);
            Fruit pear = new Fruit("Pear", R.drawable.ic_launcher_background);
            fruitList.add(pear);
            Fruit apple1 = new Fruit("Apple1", R.drawable.ic_launcher_background);
            fruitList.add(apple1);
            Fruit apple2 = new Fruit("Apple2", R.drawable.ic_launcher_background);
            fruitList.add(apple2);
            Fruit banana1 = new Fruit("Banana1", R.drawable.ic_launcher_background);
            fruitList.add(banana1);
            Fruit orange1 = new Fruit("Orange1", R.drawable.ic_launcher_background);
            fruitList.add(orange1);
            Fruit mango1 = new Fruit("Mango1", R.drawable.ic_launcher_background);
            fruitList.add(mango1);
            Fruit pear1 = new Fruit("Pear1", R.drawable.ic_launcher_background);
            fruitList.add(pear1);

        }
    }
}
