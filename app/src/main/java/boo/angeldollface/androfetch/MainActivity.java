/*
Androfetch by Alexander Abraham,
a.k.a. "Angel Dollface".
Licensed under the GNU GPL v3.
*/

package boo.angeldollface.androfetch;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

// The main class that loads resources
// and displays the relevant text about
// device and system information.
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SysInfo sysInfo = new SysInfo();

        TextView deviceInfo = findViewById(R.id.deviceInfo);
        String deviceInfoText = sysInfo.manufacturer + " " + sysInfo.deviceId;
        deviceInfo.setText(deviceInfoText);

        // The device's name (e.g. Pixel 7a).
        TextView deviceIdText = findViewById(R.id.deviceIdText);
        deviceIdText.setText(R.string.deviceIdText);
        TextView deviceId = findViewById(R.id.deviceId);
        deviceId.setText(sysInfo.deviceId);

        // The Android Version the device is running.
        TextView androidVersionText = findViewById(R.id.androidVersionText);
        androidVersionText.setText(R.string.androidVersionText);
        TextView androidVersion = findViewById(R.id.androidVersion);
        androidVersion.setText(sysInfo.androidVersion);

        // The device's uptime.
        TextView uptimeText = findViewById(R.id.uptimeText);
        uptimeText.setText(R.string.upTimeText);
        TextView uptime = findViewById(R.id.uptime);
        uptime.setText(sysInfo.upTime);

        // The device's CPU.
        TextView codeNameText = findViewById(R.id.codeNameText);
        codeNameText.setText(R.string.codeNameText);
        TextView codeName = findViewById(R.id.codeName);
        codeName.setText(sysInfo.codeName);

    }
}