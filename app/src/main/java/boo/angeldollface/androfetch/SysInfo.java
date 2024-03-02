/*
Androfetch by Alexander Abraham,
a.k.a. "Angel Dollface".
Licensed under the GNU GPL v3.
*/

package boo.angeldollface.androfetch;

import android.os.Build;
import android.os.SystemClock;

// A class to hold
// all relevant
// device and system
// information.
public class SysInfo {
    String manufacturer;
    String androidVersion;
    String deviceId;
    String codeName;
    String upTime;

    // The basic constructor of
    // this class.
    public SysInfo() {
        manufacturer = Build.MANUFACTURER;
        deviceId = Build.MODEL;
        codeName = Build.HARDWARE;
        androidVersion = Build.VERSION.RELEASE;
        upTime = new UpTime(SystemClock.uptimeMillis()).toString();
    }

}
