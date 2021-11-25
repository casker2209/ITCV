package itcv.vn;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

public class SharePreferencesHelper {
    private static SharePreferencesHelper instance;
    private static SharedPreferences sharedPreferences;
    private static String SharedPreferencesName = "User profile";
    public static SharePreferencesHelper getInstance(){
        if(instance == null) instance = new SharePreferencesHelper();
        return instance;
    }
    public static void init(Context context){
        sharedPreferences = context.getSharedPreferences(SharedPreferencesName,Context.MODE_PRIVATE);
    }
    public static void saveProfile(ProfileModel model){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String modelString = new Gson().toJson(model,ProfileModel.class);
        editor.putString("User profile",modelString);
        editor.commit();
    }
    public static ProfileModel getProfile(){
        return new Gson().fromJson(sharedPreferences.getString(SharedPreferencesName,""),ProfileModel.class);
    }
}
