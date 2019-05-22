package com.example.wotj7.project_cms;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements ToDoListRecyclerviewClickListener{

    private RecyclerView rvTodoList;
    private ToDoListAdapter todoAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTodoList = findViewById(R.id.rv_to_do_list);
        imageView = findViewById(R.id.character);
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        rvTodoList.setLayoutManager(new LinearLayoutManager(this));
        todoAdapter = new ToDoListAdapter();
        rvTodoList.setAdapter(todoAdapter);
    }

    //option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_to_to_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    //checkbox clicked
    @Override
    public void onBtnCheckClicked(Object o) {

    }

    public void onCharacterClicked(View view) {
        imageView.setImageResource(R.drawable.torry_happy);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                imageView.setImageResource(R.drawable.torry);
            }
        }, 1000);
    }
}

// 프로젝트 수정을 확인하기 위한 주석입니다.
// Testing Testing