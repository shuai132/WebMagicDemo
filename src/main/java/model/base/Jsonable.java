package model.base;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class Jsonable {
    public String toJsonString() {
        Gson gson = new GsonBuilder()
                .create();
        return gson.toJson(this);
    }

    public String toPrettyJsonString() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return gson.toJson(this);
    }

    @Override
    public String toString() {
        return toPrettyJsonString();
    }
}
