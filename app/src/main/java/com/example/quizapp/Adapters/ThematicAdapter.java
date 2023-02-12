package com.example.quizapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizapp.Models.Subject;
import com.example.quizapp.Models.ThematicArea;
import com.example.quizapp.R;

import java.util.List;

public class ThematicAdapter extends RecyclerView.Adapter<ThematicAdapter.ViewHolder>  {

    List<ThematicArea> thematicAreasList;
    Context context;

    public ThematicAdapter(List<ThematicArea> thematicAreasList, Context context) {
        this.thematicAreasList = thematicAreasList;
        this.context = context;
    }

    @NonNull
    @Override
    public ThematicAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.thematic_row, parent, false);
        return new ThematicAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThematicAdapter.ViewHolder holder, int position) {
        int pos = position;
        ThematicArea thematicArea = thematicAreasList.get(position);
        holder.thematicText.setText(thematicArea.getThematicAreaName());

    }

    @Override
    public int getItemCount() {
        return thematicAreasList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView thematicText;
        Button openThematicButton;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            thematicText = itemView.findViewById(R.id.thematicText);
            openThematicButton = itemView.findViewById(R.id.openThematicButton);

        }
    }
}
