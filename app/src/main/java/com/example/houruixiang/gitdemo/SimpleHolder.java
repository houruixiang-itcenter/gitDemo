package com.example.houruixiang.gitdemo;

import android.app.Dialog;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by houruixiang on 2017/5/26.
 */

public class SimpleHolder extends RecyclerView.ViewHolder {
    public int position;
    private Handler handler = new Handler();
   /* private ProgressDialog progressDialog = null;*/
    private Dialog loadingDialog;

    public SimpleHolder(final View itemView) {
        super(itemView);
        final MyLoading myLoading = new MyLoading(itemView.getContext());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**加载界面*/

                myLoading.show();
                /*MyLoading.createLoadingDialog(itemView.getContext(),"请稍等...").show();*/
                /*MyLoading.show(itemView.getContext(), "请稍等...", "获取数据中...",true);*/
                /*progressDialog = ProgressDialog.show(itemView.getContext(), "请稍等...", "获取数据中...",true);*/
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        myLoading.dismiss();
                    }
                },3000);
            }
        });
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
