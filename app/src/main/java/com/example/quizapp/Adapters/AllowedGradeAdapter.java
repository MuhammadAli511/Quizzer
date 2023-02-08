package com.example.quizapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizapp.HomeScreen;
import com.example.quizapp.Models.Grade;
import com.example.quizapp.Models.Requests;
import com.example.quizapp.R;
import com.example.quizapp.SingleGrade;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;
import java.util.Map;

public class AllowedGradeAdapter extends RecyclerView.Adapter<AllowedGradeAdapter.ViewHolder>  {
    List<Grade> gradesList;
    Context context;


    public AllowedGradeAdapter(List<Grade> gradesList, Context context) {
        this.gradesList = gradesList;
        this.context = context;
    }

    @NonNull
    @Override
    public AllowedGradeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.allowed_grade_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllowedGradeAdapter.ViewHolder holder, int position) {
        int pos = position;
        Grade grades = gradesList.get(position);
        holder.gradeName.setText(grades.getName());
        holder.requestAccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SingleGrade.class);
                intent.putExtra("gradeName", grades.getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gradesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView gradeName;
        Button requestAccess;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gradeName = itemView.findViewById(R.id.gradeName);
            requestAccess = itemView.findViewById(R.id.requestAccess);

        }
    }
}
