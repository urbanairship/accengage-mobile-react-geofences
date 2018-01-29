
package com.accengage.react.geofences;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNAccGeofencesModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNAccGeofencesModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
    Log.v("RN Geofences Plugin", "Plugin loaded.");

  }

  @Override
  public String getName() {
    return "RNAccGeofences";
  }
}