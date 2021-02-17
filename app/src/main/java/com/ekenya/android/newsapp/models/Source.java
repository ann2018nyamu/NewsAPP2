package com.ekenya.android.newsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source {

    // annotation provided by retrofit  used in case you want to use a different variable name from Json's key name.
    @SerializedName("id")

    // used to mark a field to be exposed or not (included or not) for serialized or de-serialized.
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String name;


    // Generate Getters and Setters.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Source(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
