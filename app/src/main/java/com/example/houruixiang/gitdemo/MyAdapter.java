package com.example.houruixiang.gitdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by houruixiang on 2017/5/26.
 */
public class MyAdapter extends RecyclerView.Adapter<SimpleHolder> {

    @Override
    public SimpleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.list_item, null);

        return new SimpleHolder(view);
    }

    @Override
    public void onBindViewHolder(SimpleHolder holder, int position) {
        holder.setPosition(position);
    }

    @Override
    public int getItemCount() {
        return 30;
    }
}
