package com.example.c4q.loopactivity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q on 12/6/17.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewholder> {
    private List<Integer> list = new ArrayList<>();
    private TextView num1;
    private TextView num2;
    private TextView num3;
    private TextView num4;
    private TextView num5;
    private TextView num6;
    private TextView num7;
    private TextView num8;
    private TextView num9;
    private TextView num10;

    public ListAdapter(List<listActivity> list) {
        this.list = list;
    }

    @Override
    public ListViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View lView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_itemview, parent, false);
        return new ListViewholder(lView);
    }

    @Override
    public void onBindViewHolder(ListViewholder holder, int position) {
        List list = list.get(position);
        holder.onBind(list);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ListViewholder extends RecyclerView.ViewHolder {

        public ListViewholder(View itemView) {
            super(itemView);
        }

        public void onBind(List list) {
            num1 = (TextView) itemView.findViewById(R.id.one);
            num2 = (TextView) itemView.findViewById(R.id.two);
            num3 = (TextView) itemView.findViewById(R.id.three);
            num4 = (TextView) itemView.findViewById(R.id.four);
            num5 = (TextView) itemView.findViewById(R.id.five);
            num6 = (TextView) itemView.findViewById(R.id.six);
            num7 = (TextView) itemView.findViewById(R.id.seven);
            num8 = (TextView) itemView.findViewById(R.id.eight);
            num9 = (TextView) itemView.findViewById(R.id.nine);
            num10 = (TextView) itemView.findViewById(R.id.ten);

        }
    }
}
