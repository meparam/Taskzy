package dvik.com.taskzy.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Divya on 11/27/2016.
 */

public class SituationModel implements Parcelable {

    String name;
    String headPhoneState;
    String weatherState;
    LatLng placesState;
    String userActivity;
    String startTime;
    String endTime;

    public SituationModel(String name, String headPhoneState, String weatherState, LatLng placesState, String userActivity, String startTime,
                          String endTime) {
        this.name = name;
        this.headPhoneState = headPhoneState;
        this.weatherState = weatherState;
        this.placesState = placesState;
        this.userActivity = userActivity;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    protected SituationModel(Parcel in) {
        name = in.readString();
        headPhoneState = in.readString();
        weatherState = in.readString();
        placesState = in.readParcelable(LatLng.class.getClassLoader());
        userActivity = in.readString();
        startTime = in.readString();
        endTime = in.readString();
    }

    public static final Creator<SituationModel> CREATOR = new Creator<SituationModel>() {
        @Override
        public SituationModel createFromParcel(Parcel in) {
            return new SituationModel(in);
        }

        @Override
        public SituationModel[] newArray(int size) {
            return new SituationModel[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadPhoneState() {
        return headPhoneState;
    }

    public void setHeadPhoneState(String headPhoneState) {
        this.headPhoneState = headPhoneState;
    }

    public LatLng getPlacesState() {
        return placesState;
    }

    public void setPlacesState(LatLng placesState) {
        this.placesState = placesState;
    }

    public String getWeatherState() {
        return weatherState;
    }

    public void setWeatherState(String weatherState) {
        this.weatherState = weatherState;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getUserActivity() {
        return userActivity;
    }

    public void setUserActivity(String userActivity) {
        this.userActivity = userActivity;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(headPhoneState);
        parcel.writeString(weatherState);
        parcel.writeParcelable(placesState, i);
        parcel.writeString(userActivity);
        parcel.writeString(startTime);
        parcel.writeString(endTime);
    }
}
