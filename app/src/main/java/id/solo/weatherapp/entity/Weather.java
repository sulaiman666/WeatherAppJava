
package id.solo.weatherapp.entity;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Weather implements Serializable, Parcelable
{

    @SerializedName("coord")
    @Expose
    private Coord coord;
    @SerializedName("weather")
    @Expose
    private List<Weather__1> weather = null;
    @SerializedName("base")
    @Expose
    private String base;
    @SerializedName("main")
    @Expose
    private Main main;
    @SerializedName("visibility")
    @Expose
    private Integer visibility;
    @SerializedName("wind")
    @Expose
    private Wind wind;
    @SerializedName("clouds")
    @Expose
    private Clouds clouds;
    @SerializedName("dt")
    @Expose
    private Integer dt;
    @SerializedName("sys")
    @Expose
    private Sys sys;
    @SerializedName("timezone")
    @Expose
    private Integer timezone;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cod")
    @Expose
    private Integer cod;
    public final static Creator<Weather> CREATOR = new Creator<Weather>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Weather createFromParcel(android.os.Parcel in) {
            return new Weather(in);
        }

        public Weather[] newArray(int size) {
            return (new Weather[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3860305289596306883L;

    protected Weather(android.os.Parcel in) {
        this.coord = ((Coord) in.readValue((Coord.class.getClassLoader())));
        in.readList(this.weather, (Weather__1.class.getClassLoader()));
        this.base = ((String) in.readValue((String.class.getClassLoader())));
        this.main = ((Main) in.readValue((Main.class.getClassLoader())));
        this.visibility = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.wind = ((Wind) in.readValue((Wind.class.getClassLoader())));
        this.clouds = ((Clouds) in.readValue((Clouds.class.getClassLoader())));
        this.dt = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.sys = ((Sys) in.readValue((Sys.class.getClassLoader())));
        this.timezone = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.cod = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Weather() {
    }

    /**
     * 
     * @param visibility
     * @param timezone
     * @param main
     * @param clouds
     * @param sys
     * @param dt
     * @param coord
     * @param weather
     * @param name
     * @param cod
     * @param id
     * @param base
     * @param wind
     */
    public Weather(Coord coord, List<Weather__1> weather, String base, Main main, Integer visibility, Wind wind, Clouds clouds, Integer dt, Sys sys, Integer timezone, Integer id, String name, Integer cod) {
        super();
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather__1> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather__1> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Weather.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coord");
        sb.append('=');
        sb.append(((this.coord == null)?"<null>":this.coord));
        sb.append(',');
        sb.append("weather");
        sb.append('=');
        sb.append(((this.weather == null)?"<null>":this.weather));
        sb.append(',');
        sb.append("base");
        sb.append('=');
        sb.append(((this.base == null)?"<null>":this.base));
        sb.append(',');
        sb.append("main");
        sb.append('=');
        sb.append(((this.main == null)?"<null>":this.main));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("wind");
        sb.append('=');
        sb.append(((this.wind == null)?"<null>":this.wind));
        sb.append(',');
        sb.append("clouds");
        sb.append('=');
        sb.append(((this.clouds == null)?"<null>":this.clouds));
        sb.append(',');
        sb.append("dt");
        sb.append('=');
        sb.append(((this.dt == null)?"<null>":this.dt));
        sb.append(',');
        sb.append("sys");
        sb.append('=');
        sb.append(((this.sys == null)?"<null>":this.sys));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("cod");
        sb.append('=');
        sb.append(((this.cod == null)?"<null>":this.cod));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.visibility == null)? 0 :this.visibility.hashCode()));
        result = ((result* 31)+((this.timezone == null)? 0 :this.timezone.hashCode()));
        result = ((result* 31)+((this.main == null)? 0 :this.main.hashCode()));
        result = ((result* 31)+((this.clouds == null)? 0 :this.clouds.hashCode()));
        result = ((result* 31)+((this.sys == null)? 0 :this.sys.hashCode()));
        result = ((result* 31)+((this.dt == null)? 0 :this.dt.hashCode()));
        result = ((result* 31)+((this.coord == null)? 0 :this.coord.hashCode()));
        result = ((result* 31)+((this.weather == null)? 0 :this.weather.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.cod == null)? 0 :this.cod.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.base == null)? 0 :this.base.hashCode()));
        result = ((result* 31)+((this.wind == null)? 0 :this.wind.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Weather) == false) {
            return false;
        }
        Weather rhs = ((Weather) other);
        return ((((((((((((((this.visibility == rhs.visibility)||((this.visibility!= null)&&this.visibility.equals(rhs.visibility)))&&((this.timezone == rhs.timezone)||((this.timezone!= null)&&this.timezone.equals(rhs.timezone))))&&((this.main == rhs.main)||((this.main!= null)&&this.main.equals(rhs.main))))&&((this.clouds == rhs.clouds)||((this.clouds!= null)&&this.clouds.equals(rhs.clouds))))&&((this.sys == rhs.sys)||((this.sys!= null)&&this.sys.equals(rhs.sys))))&&((this.dt == rhs.dt)||((this.dt!= null)&&this.dt.equals(rhs.dt))))&&((this.coord == rhs.coord)||((this.coord!= null)&&this.coord.equals(rhs.coord))))&&((this.weather == rhs.weather)||((this.weather!= null)&&this.weather.equals(rhs.weather))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.cod == rhs.cod)||((this.cod!= null)&&this.cod.equals(rhs.cod))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.base == rhs.base)||((this.base!= null)&&this.base.equals(rhs.base))))&&((this.wind == rhs.wind)||((this.wind!= null)&&this.wind.equals(rhs.wind))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(coord);
        dest.writeList(weather);
        dest.writeValue(base);
        dest.writeValue(main);
        dest.writeValue(visibility);
        dest.writeValue(wind);
        dest.writeValue(clouds);
        dest.writeValue(dt);
        dest.writeValue(sys);
        dest.writeValue(timezone);
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(cod);
    }

    public int describeContents() {
        return  0;
    }

}
