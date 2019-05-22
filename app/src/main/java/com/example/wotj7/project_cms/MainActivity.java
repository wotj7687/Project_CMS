package com.example.wotj7.project_cms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements ToDoListRecyclerviewClickListener{

    private RecyclerView rvTodoList;
    private ToDoListAdapter todoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTodoList = findViewById(R.id.rv_to_do_list);
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
}

// 프로젝트 수정을 확인하기 위한 주석입니다.
// Testing Testing