
package id.solo.weatherapp.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Wind implements Serializable, Parcelable
{

    @SerializedName("speed")
    @Expose
    private Double speed;
    @SerializedName("deg")
    @Expose
    private Integer deg;
    public final static Creator<Wind> CREATOR = new Creator<Wind>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Wind createFromParcel(android.os.Parcel in) {
            return new Wind(in);
        }

        public Wind[] newArray(int size) {
            return (new Wind[size]);
        }

    }
    ;
    private final static long serialVersionUID = -1495881010764714978L;

    protected Wind(android.os.Parcel in) {
        this.speed = ((Double) in.readValue((Double.class.getClassLoader())));
        this.deg = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wind() {
    }

    /**
     * 
     * @param deg
     * @param speed
     */
    public Wind(Double speed, Integer deg) {
        super();
        this.speed = speed;
        this.deg = deg;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Wind.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("speed");
        sb.append('=');
        sb.append(((this.speed == null)?"<null>":this.speed));
        sb.append(',');
        sb.append("deg");
        sb.append('=');
        sb.append(((this.deg == null)?"<null>":this.deg));
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
        result = ((result* 31)+((this.speed == null)? 0 :this.speed.hashCode()));
        result = ((result* 31)+((this.deg == null)? 0 :this.deg.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Wind) == false) {
            return false;
        }
        Wind rhs = ((Wind) other);
        return (((this.speed == rhs.speed)||((this.speed!= null)&&this.speed.equals(rhs.speed)))&&((this.deg == rhs.deg)||((this.deg!= null)&&this.deg.equals(rhs.deg))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(speed);
        dest.writeValue(deg);
    }

    public int describeContents() {
        return  0;
    }

}
