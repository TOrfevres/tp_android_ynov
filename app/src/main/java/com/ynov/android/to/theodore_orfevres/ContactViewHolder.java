package com.ynov.android.to.theodore_orfevres;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView img = null;
    private TextView label = null;

    ContactViewHolder(View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.contact_details_img);
        label = itemView.findViewById(R.id.contact_details_label);
    }

    TextView getImg() {
        return img;
    }

    TextView getLabel() {
        return label;
    }
}
