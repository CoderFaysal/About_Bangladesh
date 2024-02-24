package com.coderfaysal.aboutbangladesh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView it_recycle;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        it_recycle = findViewById(R.id.it_recycle);

        BD();

        MyAdapter myAdapter = new MyAdapter();
        it_recycle.setAdapter(myAdapter);
        it_recycle.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }



    public void BD(){

        hashMap = new HashMap<>();
        hashMap.put("title", "Bangladesh");
        hashMap.put("desc", "The riverine country of Bangladesh (“Land of the Bengals”) is one of the most densely populated countries in the world, and its people are predominantly Muslim. As the eastern portion of the historical region of Bengal, the area once formed, along with what is now the Indian state of West Bengal, the province of Bengal in British India. With the partition of India in 1947, it became the Pakistani province of East Bengal (later renamed East Pakistan), one of five provinces of Pakistan, separated from the other four by 1,100 miles (1,800 km) of Indian territory. In 1971 it became the independent country of Bangladesh, with its capital at Dhaka");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Land");
        hashMap.put("desc", "Bangladesh is bordered by the Indian states of West Bengal to the west and north, Assam to the north, Meghalaya to the north and northeast, and Tripura and Mizoram to the east. To the southeast, it shares a boundary with Myanmar (Burma). The southern part of Bangladesh opens into the Bay of Bengal.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Relief");
        hashMap.put("desc", "Stretching northward from the Bay of Bengal, Bangladesh constitutes roughly the eastern two-thirds of the deltaic plain of the Padma (Ganges [Ganga]) and Jamuna (Brahmaputra) rivers. Except for small higher areas of jungle-covered old alluvium (rising to about 100 feet [30 metres]) in the northwest and north-centre—in the Barind and the Madhupur Tract, respectively—the plain is a flat surface of recent alluvium, having a gentle slope and an elevation of generally less than 30 feet (9 metres) above sea level. In the northeast and southeast—in the Sylhet and Chittagong Hills areas, respectively—the alluvial plains give place to ridges, running mainly north-south, that form part of the mountains that separate Bangladesh from Myanmar and India. In its southern region, Bangladesh is fringed by the Sundarbans, a huge expanse of marshy deltaic forest.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Drainage of Bangladesh");
        hashMap.put("desc", "The most significant feature of the Bangladesh landscape is provided by the rivers, which have molded not only its physiography but also the way of life of the people. Rivers in Bangladesh, however, are subject to constant and sometimes rapid changes of course, which can affect the hydrology of a large region; consequently, no description of Bangladesh’s topography retains its absolute accuracy for long. One spectacular example of such a change occurred in 1787, when the Tista River underwent exceptionally high flooding; its waters were suddenly diverted eastward, where they reinforced the Brahmaputra. The swollen Brahmaputra in turn began to cut into a minor stream, which by the early 1800s had become the river’s main lower course, now known as the Jamuna. A much smaller river (the Old Brahmaputra) now flows through the Brahmaputra’s former course.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Soils");
        hashMap.put("desc", "There are three main categories of soils in Bangladesh: the old alluvial soils, the recent alluvial soils, and the hill soils, which have a base of sandstone and shale. The fertile recent alluvial soils, found mainly in flooded areas, are usually clays and loams, variously pale brown, sandy, chalky, and mica-laden. They are deficient in phosphoric acid, nitrogen, and humus but not in potash and lime. The old alluvial soils in the jungles of the Barind and Madhupur regions are dark iron-rich brown or reddish clays and loams. They are sticky during the rainy season and hard during the dry periods. The hill soils are generally permeable and can support dense forest growth.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Climate");
        hashMap.put("desc", "Bangladesh has a typical monsoon climate characterized by rain-bearing winds, moderately warm temperatures, and high humidity. In general, maximum temperatures in the summer months, from April to September, are in the low to mid-90s F (mid-30s C). April is the warmest month in most parts. The range of high temperatures in the winter months, from November to March, is greater than in the summer months. January is the coolest month, with high temperatures averaging in the mid- to upper 70s F (mid-20s C).");
        arrayList.add(hashMap);


    }


    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.items, parent, false);

            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

            hashMap = arrayList.get(position);
            String name = hashMap.get("title");
            String dec = hashMap.get("desc");

            holder.it_name.setText(name);

            holder.click_lay.setOnClickListener(view -> {

                Datails.TITLE = name;
                Datails.DESC = dec;
                startActivity(new Intent(MainActivity.this, Datails.class));

            });

        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class MyViewHolder extends RecyclerView.ViewHolder{

            LinearLayout click_lay;
            TextView it_name;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                click_lay = itemView.findViewById(R.id.click_lay);
                it_name = itemView.findViewById(R.id.it_name);


            }
        }

    }


}