package com.example.sccm.recyclerviewscrollanimation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{

    List<RecyclerModel> mRecyclerModels;
    private Context mContext;

    public RecyclerAdapter(List<RecyclerModel> recyclerModels, Context context) {
        mRecyclerModels = recyclerModels;
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_view_layout,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        int lastPosition = -1;

        holder.imageView.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_transititon));
        holder.container.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_scale_animation));

        holder.imageView.setImageResource(mRecyclerModels.get(position).image);
        holder.headline.setText(mRecyclerModels.get(position).headline);
        holder.description.setText(mRecyclerModels.get(position).description);

        /*Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition) ? R.anim.up_from_bottom
                        : R.anim.down_from_top);
        holder.itemView.startAnimation(animation);*/
        lastPosition = position;

    }

    @Override
    public void onViewDetachedFromWindow(@NonNull RecyclerViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.itemView.clearAnimation();

    }

    @Override
    public int getItemCount() {
        return mRecyclerModels.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{

        TextView headline,description;
        ImageView imageView;
        LinearLayout container;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            headline = itemView.findViewById(R.id.headline);
            description = itemView.findViewById(R.id.description);
            imageView = itemView.findViewById(R.id.imageView);
            container = itemView.findViewById(R.id.container);
        }
    }
}
