package com.example.myadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<Object> mList;
    private PhotoAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycler_view);
        initDate();
        mAdapter = new PhotoAdapter();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,4);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setData(mList);
    }

    private void initDate() {
        mList = new ArrayList<>();
        for (int j=0;j<6;j++){
            mList.add("2021-03-14");
            for (int i=0;i<5;i++) {
                mList.add(R.drawable.pic);
            }
        }
    }

}