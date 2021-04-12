package com.example.kurokonobasket;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Collection;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.ViewHolder> {
    private Context context;
    private ArrayList<CharacterModel> characterModels;

    public CharacterAdapter(Context context, ArrayList<CharacterModel> characterModels) {
        this.context = context;
        this.characterModels = characterModels;
    }

    public ArrayList<CharacterModel> getCharacterModels() {
        return characterModels;
    }

//    public void setFootballModels(ArrayList<FootballModel> footballModels) {
//        this.footballModels = footballModels;
//    }

    @NonNull
    @Override
    public CharacterAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.characters,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getCharacterModels().get(i).getCharProfile()).into
                (viewHolder.ivCharProfile);
        //viewHolder.ivCharProfile.setImageResource(getFootballModels().get(i).getLambangTeam());
        viewHolder.tvCharName.setText(getCharacterModels().get(i).getCharName());
        viewHolder.btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Details.class);
                intent.putExtra("profile", getCharacterModels().get(i).getCharProfile());
                intent.putExtra("name", getCharacterModels().get(i).getCharName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getCharacterModels().size();
    }

//    private ArrayList<FootballModel> getFootbalList() {
//        return null;
//    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivCharProfile;
        TextView tvCharName;
        Button btnDetails;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivCharProfile   = itemView.findViewById(R.id.char_profile);
            tvCharName      = itemView.findViewById(R.id.char_name);
            btnDetails      = itemView.findViewById(R.id.details);
        }
    }
}