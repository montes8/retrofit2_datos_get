package com.example.eddymontesinos.demo_retrofit;

public class Earthquake  {

    private String type;
    private EarthquakeMetaData metadata;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EarthquakeMetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(EarthquakeMetaData metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "Earthquake{" +
                "type='" + type + '\'' +
                ", metadata=" + metadata +
                '}';
    }
}