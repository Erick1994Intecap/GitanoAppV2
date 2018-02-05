package com.aesc.santos.gitanoapp.RecyclerViews;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.aesc.santos.gitanoapp.entidades.textoCardProd;

import java.util.ArrayList;

/**
 * Created by Android on 5/02/2018.
 */

public class AdaptadorProducto extends RecyclerView.Adapter<AdaptadorProducto.ProductoViewHolder> {
ArrayList<textoCardProd> listaProd;

    public AdaptadorProducto(ArrayList<textoCardProd> listaProd) {
        this.listaProd = listaProd;
    }

    @Override
    public ProductoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ProductoViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ProductoViewHolder extends RecyclerView.ViewHolder {
        public ProductoViewHolder(View itemView) {
            super(itemView);
        }
    }
}
