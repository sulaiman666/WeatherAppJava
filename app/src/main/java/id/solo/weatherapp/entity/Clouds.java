
package id.solo.weatherapp.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Clouds implements Serializable, Parcelable
{

    @SerializedName("all")
    @Expose
    private Integer all;
    public final static Creator<Clouds> CREATOR = new Creator<Clouds>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Clouds createFromParcel(android.os.Parcel in) {
            return new Clouds(in);
        }

        public Clouds[] newArray(int size) {
            return (new Clouds[size]);
        }

    }
    ;
    private final static long serialVersionUID = -7174976625671424856L;

    protected Clouds(android.os.Parcel in) {
        this.all = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Clouds() {
    }

    /**
     * 
     * @param all
     */
    public Clouds(Integer all) {
        super();
        this.all = all;
    }

    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Clouds.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("all");
        sb.append('=');
        sb.append(((this.all == null)?"<null>":this.all));
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
        result = ((result* 31)+((this.all == null)? 0 :this.all.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Clouds) == false) {
            return false;
        }
        Clouds rhs = ((Clouds) other);
        return ((this.all == rhs.all)||((this.all!= null)&&this.all.equals(rhs.all)));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(all);
    }

    public int describeContents() {
        return  0;
    }

}
