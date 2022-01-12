package com.example.testlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //hi

    private ListView listView ;
    private int[] imageViewArr = new int[]{ R.drawable.room, R.drawable.room2 , R.drawable.room3 , R.drawable.room4 , R.drawable.room8};
    private String[] pricesArr = new String[]{"100$" , "240$" , "390$" , "670$" , "230$" };
    private String[] roomTypeArr = new String[]{"triple" , "double" , "triple" , "double" , "single"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("fuckkkk" , "android");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listViewRoom);

        MyAdapter adapter = new MyAdapter();
        listView.setAdapter(adapter);

    }

    class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return imageViewArr.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.card , viewGroup , false);
            ImageView imageViewRoom = view.findViewById(R.id.imageView);
            TextView textViewPrice = view.findViewById(R.id.textViewRoomPrice);
            TextView textViewType = view.findViewById(R.id.textViewRoomType);
            textViewPrice.setText(pricesArr[i]);
            textViewType.setText(roomTypeArr[i]);
            imageViewRoom.setImageResource(imageViewArr[i]);


            //return null;
            return view ;
        }
    }

}