package com.example.pemrograman_bhs;

import android.os.Parcel;
import android.os.Parcelable;

public class Bahasa implements Parcelable {
    private String name;
    private String detail;
    private int photo;

    public Bahasa(){

    }

    protected Bahasa(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Bahasa> CREATOR = new Creator<Bahasa>() {
        @Override
        public Bahasa createFromParcel(Parcel in) {
            return new Bahasa(in);
        }

        @Override
        public Bahasa[] newArray(int size) {
            return new Bahasa[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeInt(photo);
    }
}
