# MovieApp

MovieApp is a simple Android movie catalog built with Kotlin and Jetpack Compose. It shows a list of movies, lets the user expand each row to see extra metadata, and opens a detail screen with a horizontal gallery for the selected movie.

## Demo

Watch a short demo of the app on YouTube: [MovieApp Demo](https://youtube.com/shorts/7jIiA26zPzU?feature=share)

## Features

- Home screen with a scrollable movie list.
- Expandable movie cards that show plot, director, actors, and rating.
- Detail screen navigation for each movie.
- Remote poster and gallery image loading with Coil.
- Material 3 UI with a small Compose theme setup.
- Custom MovieApp launcher logo.
- Native splash screen.
- Optimized debug and release APK builds.
- Static sample movie data stored in Kotlin.

## Tech Stack

- Kotlin
- Jetpack Compose
- Material 3
- Navigation Compose
- Coil 3
- AndroidX SplashScreen
- Gradle Kotlin DSL

## Release

The first stable release is `v1.0.0`.

Download `MovieApp.apk` from the GitHub release assets to install the app on an Android device.

## Project Structure

```text
MovieApp/
├── app/
│   ├── build.gradle.kts
│   └── src/
│       ├── main/
│       │   ├── AndroidManifest.xml
│       │   ├── java/azizi/ahmed/movieapp/
│       │   │   ├── MainActivity.kt
│       │   │   ├── packages/model/Movie.kt
│       │   │   ├── packages/navigation/
│       │   │   ├── packages/screens/
│       │   │   └── ui/theme/
│       │   └── res/
│       ├── androidTest/
│       └── test/
├── gradle/libs.versions.toml
├── build.gradle.kts
└── settings.gradle.kts
```

## Requirements

- Android Studio
- JDK 11 or newer
- Android SDK with compile SDK 34 installed

## Run The App

1. Open the project in Android Studio.
2. Let Gradle sync the project.
3. Select an emulator or Android device.
4. Run the `app` configuration.

From a terminal, you can also build the debug APK:

```powershell
.\gradlew.bat assembleDebug
```

To build both debug and release APKs:

```powershell
.\gradlew.bat assembleDebug assembleRelease
```

## Notes

- The app currently uses local sample data from `Movie.kt`; it does not call a movie API.
- Internet permission is enabled because movie posters and gallery images are loaded from remote URLs.
- Signing files such as `.jks` keystores, local Gradle properties, IDE state, and generated APK/release files are intentionally ignored by Git.
