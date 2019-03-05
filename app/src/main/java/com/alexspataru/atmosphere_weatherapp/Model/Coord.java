package com.alexspataru.atmosphere_weatherapp.Model;

public class Coord {
    private double lon;
    private double lng;

  public Coord() {

  }
    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public String toString(){
      return new StringBuilder("[").append(this.lng).append(',').append(this.lon).append("]").toString();
    }

}
