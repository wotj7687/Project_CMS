package com.example.wotj7.project_cms;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ToDoListAdapter extends RecyclerView.Adapter<ToDoListAdapter.ToDoListVH> {

    private ToDoListRecyclerviewClickListener listener;
    private List todoList = new ArrayList();

    @NonNull
    @Override
    public ToDoListVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_to_do_list, viewGroup, false);
        return new ToDoListVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoListVH toDoListVH, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ToDoListVH extends RecyclerView.ViewHolder {
        ImageView btnCheck;
        TextView tvTodo;
        public ToDoListVH(View itemView) {
            super(itemView);
            btnCheck = itemView.findViewById(R.id.btn_check);
            tvTodo = itemView.findViewById(R.id.to_do);

            btnCheck.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onBtnCheckClicked(todoList.get(getAdapterPosition()));
                }
            });
        }
    }
}
