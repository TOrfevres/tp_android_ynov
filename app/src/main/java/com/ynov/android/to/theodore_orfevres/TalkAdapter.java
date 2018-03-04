package com.ynov.android.to.theodore_orfevres;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ynov.android.to.theodore_orfevres.bean.Contact;

import java.util.List;

public class TalkAdapter extends RecyclerView.Adapter<TalkViewHolder> {
    private List<Contact> talks = null;

    TalkAdapter(List<Contact> talks) {
        this.talks = talks;
    }

    @NonNull
    @Override
    public TalkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View talkView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.talk_view, parent, false);
        return new TalkViewHolder(talkView);
    }

    @Override
    public void onBindViewHolder(@NonNull TalkViewHolder holder, int position) {
        String[] words = talks.get(position).getName().split(" ");
        String initials = "" + words[0].charAt(0) + words[1].charAt(0);
        holder.getImg().setText(initials);

        holder.getLabel().setText(talks.get(position).getName());

        List<String> talksList = talks.get(position).getTalks();
        holder.getDesc().setText(talksList.get(talksList.size() - 1));
    }

    @Override
    public int getItemCount() {
        return talks.size();
    }
}
