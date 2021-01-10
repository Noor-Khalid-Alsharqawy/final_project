package com.example.t;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PetAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<Pet> pArray;

    public PetAdapter(Context context, ArrayList<Pet> pArray) {
        this.context = context;
        this.pArray = pArray;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pet_card
                , parent, false);
        ViewHolder vh= new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(pArray.get(position).isWaiting()){
            ((ViewHolder) holder).ifWaitingicon.setImageResource(R.drawable.ic_baseline_play_circle_24);
            ((ViewHolder) holder).ifWaitingText.setText("منتظر");
        }
        else {
            ((ViewHolder) holder).ifWaitingicon.setImageResource(R.drawable.ic_baseline_pause_circle_24);
            ((ViewHolder) holder).ifWaitingText.setText("محجوز");
        }
        ((ViewHolder) holder).typeLogo.setImageResource(pArray.get(position).getLogo());
        ((ViewHolder) holder).name.setText(pArray.get(position).getAnnouncerName());
        ((ViewHolder) holder).location.setText(pArray.get(position).getLocation());
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(context,Details.class);
                i.putExtra("from adapter to detail",pArray.get(position));
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() { return pArray.size(); }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView ifWaitingicon;
        public TextView ifWaitingText;
        public ImageView typeLogo;
        public TextView name;
        public TextView location;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            ifWaitingicon = itemView.findViewById(R.id.ii2);
            ifWaitingText = itemView.findViewById(R.id.tt1);
            typeLogo = itemView.findViewById(R.id.ii1);
            name = itemView.findViewById(R.id.tt2);
            location = itemView.findViewById(R.id.tt4);
        }
    }
}
