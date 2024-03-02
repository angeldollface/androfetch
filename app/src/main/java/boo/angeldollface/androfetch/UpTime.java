/*
Androfetch by Alexander Abraham,
a.k.a. "Angel Dollface".
Licensed under the GNU GPL v3.
*/

package boo.angeldollface.androfetch;

import androidx.annotation.NonNull;

// An extra processor
// for processing Android's
// own uptime-measuring
// APIs further.
public class UpTime {
    long seconds;
    // The basic constructor of
    // this class.
    public UpTime(long millis){
        long generalSeconds = millis / 1000;
        seconds = generalSeconds;
    }

    // A convenience method
    // to return a string
    // representation of
    // the device's uptime.
    @NonNull
    public String toString(){
        return seconds + "s ";
    }
}
