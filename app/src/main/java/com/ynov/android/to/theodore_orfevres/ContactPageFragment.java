package com.ynov.android.to.theodore_orfevres;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ynov.android.to.theodore_orfevres.bean.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactPageFragment extends Fragment {
    private List<Contact> contacts = null;

    public ContactPageFragment() {
        //
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            contacts = getArguments().getParcelableArrayList("contact_list");
        } catch (Exception e) {
            contacts = new ArrayList<>();
            contacts.add(new Contact(
                    "BUILDING ERROR",
                    new ArrayList<String>()
            ));
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_contact_page, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.contact_rView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        ContactAdapter adapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
