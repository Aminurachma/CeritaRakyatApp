package com.nila.submissionaminurachmadicoding.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.nila.submissionaminurachmadicoding.DetailCerita;
import com.nila.submissionaminurachmadicoding.R;
import com.nila.submissionaminurachmadicoding.model.Cerita;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CeritaAdapter extends RecyclerView.Adapter<CeritaAdapter.ViewHolder>{

    private Context context;
    private ArrayList<Cerita> listCerita;

    public CeritaAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Cerita> getListCerita() {
        return listCerita;
    }

    public void setListCerita(ArrayList<Cerita> listCerita) {
        this.listCerita = listCerita;
    }

    @NonNull
    @Override
    public CeritaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cerita,viewGroup,false);
        return new CeritaAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CeritaAdapter.ViewHolder viewHolder, int i) {
        viewHolder.noCerita.setText(getListCerita().get(i).getNoCerita());
        viewHolder.judulCerita.setText(getListCerita().get(i).getJudulCerita());
        Glide.with(context)
                .load(getListCerita().get(i).getImgCerita())
                .into(viewHolder.imageCerita);
    }

    @Override
    public int getItemCount() {
        return getListCerita().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.no_cerita)
        TextView noCerita;

        @BindView(R.id.judul_cerita)
        TextView judulCerita;

        @BindView(R.id.img_cerita)
        ImageView imageCerita;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int post = getAdapterPosition();
                    Intent intent = new Intent(context , DetailCerita.class);
                    intent.putExtra("JudulCerita", getListCerita().get(post).getJudulCerita());
                    intent.putExtra("ImgCerita",getListCerita().get(post).getImgCerita());
                    intent.putExtra("Cerita",getListCerita().get(post).getDetailCerita());

                    context.startActivity(intent);
                }
            });
        }
    }
}
