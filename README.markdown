<p align="center">
 <img src="logo/logo.png" style="width:150px;height:150px"/>
</p>

# ANDROFETCH :robot: :gear:

***A neofetch-like app for Android. :robot: :gear:***

## ABOUT :books:

Since I recently got a Pixel device and love to tinker with my devices and wanted to learn about Android development the *Android* way, I wanted to write a small app.
Since I'm used to running *Neofetch* on nearly all my devices, I thought it would be cool to have an app that serves a similar purpose. This repository contains the source code for this app. 
I learned a lot and learned how to program in Java. Enjoy. :heart:

## SCREENSHOT :camera:

<p align="center">
 <img src="screenshot/screenie.png"/>
</p>

## INSTALLATION :inbox_tray:

To install *Androfetch*, simply head over to this repository's [`Releases`](https://github.com/angeldollface/androfetch/releases) and download the APK for your architecture. You may have to allow your browser to install APK files from "Unknown Sources". The following architectures have bundles:

- ARM v8a
- ARM v7a EABI
- x86 64-bit
- x86 32-bit

## USAGE :hammer:

Once the app is installed, simply open it and behold the statistics!

Currently supported statistics include:

- Device Manufacturer
- Device Model Name
- Device Codename
- Device Uptime
- Device Android Version

## BUILDING FROM SOURCE :hammer_and_pick:

***IMPORTANT INFORMATION: You are free to modify, redistribute, and do whatever you wish with this app. You are not allowed, however, to sell this app!***

### Requirements

Make sure you have the following tools installed and available from the command line:

- Gradle
- A Java SDK
- The Java Keytool

Please note that Android Studio will come pre-bundled with all of the above, should you choose to install it.

You will need a Java Keystore if you are making release builds. This keystore can be generated with the following command:

```bash
keytool -genkey -v -keystore my-release-key.jks -keyalg RSA -keysize 2048 -validity 10000 -alias my-alias
```

Replace `my-release-key.jks` with the desired filename and `my-alias` with the desired alias.

### Making a release build

- Create a file called `keystore.properties` at the root of this project and put the following inside:

```Text
storePassword=your_password_for_your_keystore
keyPassword=your_password_for_your_keystore
keyAlias=keystore_alias
storeFile=key_store_path
```
- `your_password_for_your_keystore` is a placeholder for your actual password of your actual keystore. `keystore_alias` is a placeholder for your keystore's alias and `key_store_path` is a placeholder for the path to your keystore.

- Run the following command from the root of this project:
    - Windows: `./gradlew.bat assembleRelease`
    - Nix: `./gradlew assembleRelease`

- This should produce four APKs in the `app/build/outputs/apk/release` folder for each architecture that *Androfetch* can be built for.

### Making a debug build

- Create a file called `local.properties` at the root of this project and put the following inside it:

```text
sdk.dir=location_of_your_android_sdk_installation
```

- `location_of_your_android_sdk_installation` refers to the path of the root of your installation of the Android SDK.

- To make a debug build for testing run this command from the root of this project:

- Windows:

```bash
./gradlew.bat assembleDebug
```

- Nix:
```bash
./gradlew assembleDebug
```

## PROBLEMS :thinking:

If you encounter any problems or difficulties, please open an issue [here](https://github.com/angeldollface/androfetch/issues).

## CHANGELOG :black_nib:

### Version 0.1.0

- Initial release.
- Upload to GitHub.

## NOTE :scroll:

- *Androfetch :robot: :gear:.* by Alexander Abraham :black_heart: a.k.a. *"Angel Dollface" :dolls: :ribbon:*
- Licensed under the GNU GPL v3.
