package com.example.testjava.ui;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testjava.R;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.MyViewHolder> {

    String data1[], data2[], data3[];
    int images[];
    Context context;


    public MyAdapter2(Context ct, String s1[], String s2[], String s3[], int img[])
    {
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        images = img;
    }
    //set_item
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row2, parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.person_name_txt.setText(data1[position]);
        holder.person_description_txt.setText(data2[position%3]);
        holder.category_txt.setText(data3[position%3]);
        holder.myImage.setImageResource(images[0]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MentorProfileActivity.class);
                intent.putExtra("data1",data1[position]);
                intent.putExtra("data2",data2[position%3]);
                intent.putExtra("data3",data3[position%3]);
                intent.putExtra("myImage",images[0]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView person_name_txt, person_description_txt, category_txt;
        ImageView myImage;
        ConstraintLayout mainLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            person_name_txt = itemView.findViewById(R.id.person_name_txt);
            person_description_txt = itemView.findViewById(R.id.person_description_txt);
            category_txt = itemView.findViewById(R.id.category_txt);
            myImage = itemView.findViewById(R.id.myImageView);
            mainLayout=itemView.findViewById(R.id.mainLayout);
        }
    }
}
