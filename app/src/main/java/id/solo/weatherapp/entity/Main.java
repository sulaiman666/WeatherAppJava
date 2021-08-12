
package id.solo.weatherapp.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Main implements Serializable, Parcelable
{

    @SerializedName("temp")
    @Expose
    private Double temp;
    @SerializedName("feels_like")
    @Expose
    private Double feelsLike;
    @SerializedName("temp_min")
    @Expose
    private Double tempMin;
    @SerializedName("temp_max")
    @Expose
    private Double tempMax;
    @SerializedName("pressure")
    @Expose
    private Integer pressure;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    public final static Creator<Main> CREATOR = new Creator<Main>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Main createFromParcel(android.os.Parcel in) {
            return new Main(in);
        }

        public Main[] newArray(int size) {
            return (new Main[size]);
        }

    }
    ;
    private final static long serialVersionUID = -880816720930038279L;

    protected Main(android.os.Parcel in) {
        this.temp = ((Double) in.readValue((Double.class.getClassLoader())));
        this.feelsLike = ((Double) in.readValue((Double.class.getClassLoader())));
        this.tempMin = ((Double) in.readValue((Double.class.getClassLoader())));
        this.tempMax = ((Double) in.readValue((Double.class.getClassLoader())));
        this.pressure = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.humidity = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Main() {
    }

    /**
     * 
     * @param feelsLike
     * @param tempMax
     * @param temp
     * @param humidity
     * @param pressure
     * @param tempMin
     */
    public Main(Double temp, Double feelsLike, Double tempMin, Double tempMax, Integer pressure, Integer humidity) {
        super();
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Main.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("temp");
        sb.append('=');
        sb.append(((this.temp == null)?"<null>":this.temp));
        sb.append(',');
        sb.append("feelsLike");
        sb.append('=');
        sb.append(((this.feelsLike == null)?"<null>":this.feelsLike));
        sb.append(',');
        sb.append("tempMin");
        sb.append('=');
        sb.append(((this.tempMin == null)?"<null>":this.tempMin));
        sb.append(',');
        sb.append("tempMax");
        sb.append('=');
        sb.append(((this.tempMax == null)?"<null>":this.tempMax));
        sb.append(',');
        sb.append("pressure");
        sb.append('=');
        sb.append(((this.pressure == null)?"<null>":this.pressure));
        sb.append(',');
        sb.append("humidity");
        sb.append('=');
        sb.append(((this.humidity == null)?"<null>":this.humidity));
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
        result = ((result* 31)+((this.feelsLike == null)? 0 :this.feelsLike.hashCode()));
        result = ((result* 31)+((this.tempMax == null)? 0 :this.tempMax.hashCode()));
        result = ((result* 31)+((this.temp == null)? 0 :this.temp.hashCode()));
        result = ((result* 31)+((this.humidity == null)? 0 :this.humidity.hashCode()));
        result = ((result* 31)+((this.pressure == null)? 0 :this.pressure.hashCode()));
        result = ((result* 31)+((this.tempMin == null)? 0 :this.tempMin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Main) == false) {
            return false;
        }
        Main rhs = ((Main) other);
        return (((((((this.feelsLike == rhs.feelsLike)||((this.feelsLike!= null)&&this.feelsLike.equals(rhs.feelsLike)))&&((this.tempMax == rhs.tempMax)||((this.tempMax!= null)&&this.tempMax.equals(rhs.tempMax))))&&((this.temp == rhs.temp)||((this.temp!= null)&&this.temp.equals(rhs.temp))))&&((this.humidity == rhs.humidity)||((this.humidity!= null)&&this.humidity.equals(rhs.humidity))))&&((this.pressure == rhs.pressure)||((this.pressure!= null)&&this.pressure.equals(rhs.pressure))))&&((this.tempMin == rhs.tempMin)||((this.tempMin!= null)&&this.tempMin.equals(rhs.tempMin))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(temp);
        dest.writeValue(feelsLike);
        dest.writeValue(tempMin);
        dest.writeValue(tempMax);
        dest.writeValue(pressure);
        dest.writeValue(humidity);
    }

    public int describeContents() {
        return  0;
    }

}
