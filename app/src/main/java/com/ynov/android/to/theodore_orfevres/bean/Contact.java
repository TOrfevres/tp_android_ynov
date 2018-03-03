package com.ynov.android.to.theodore_orfevres.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Contact implements Parcelable {
    private String name;
    private List<String> talks;

    public Contact(String name, List<String> talks) {
        this.name = name;
        this.talks = talks;
    }

    private Contact(Parcel in) {
        name = in.readString();
        in.readStringList(talks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTalks() {
        return talks;
    }

    public void setTalks(List<String> talks) {
        this.talks = talks;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeStringList(talks);
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };
}
