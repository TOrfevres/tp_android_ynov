package com.ynov.android.to.theodore_orfevres;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class TalkViewHolder extends RecyclerView.ViewHolder {
    private TextView img = null;
    private TextView label = null;
    private TextView desc = null;

    TalkViewHolder(View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.talk_details_img);
        label = itemView.findViewById(R.id.talk_details_label);
        desc = itemView.findViewById(R.id.talk_details_desc);
    }

    TextView getImg() {
        return img;
    }

    TextView getLabel() {
        return label;
    }

    TextView getDesc() {
        return desc;
    }
}
