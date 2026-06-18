# MovieApp

MovieApp is a simple Android movie catalog built with Kotlin and Jetpack Compose. It lets users browse movies, view poster images, expand movie cards for quick details, and open a dedicated detail screen with an image gallery.

## About

MovieApp is designed as a lightweight movie browsing experience. Instead of showing only a plain list of titles, it gives users a visual catalog with posters, ratings, plot summaries, directors, actors, and gallery images.

The app demonstrates a complete Compose UI architecture including navigation, image loading, and custom theming — built entirely with Kotlin.

## Problem It Solves

MovieApp makes movie browsing more visual and interactive by combining poster-based discovery, expandable movie cards, detailed movie information, and image galleries in one clean mobile interface.

Users can quickly scan movies, open more information only when they need it, and explore each movie through a focused detail screen.

## Demo

[![Watch Demo](https://img.youtube.com/vi/7jIiA26zPzU/0.jpg)](https://youtube.com/shorts/7jIiA26zPzU)

## Screenshots

| Home Screen | Expanded Details | Movie Detail |
|---|---|---|
| <img width="220" src="https://github.com/user-attachments/assets/ff0792dc-8296-4cd9-9d57-c1ee563d0690" alt="MovieApp screenshot 1" /> | <img width="220" src="https://github.com/user-attachments/assets/3de5ab18-438e-45ff-94de-40dcd009745a" alt="MovieApp screenshot 2" /> | <img width="220" src="https://github.com/user-attachments/assets/2112d234-2a20-44fa-8a50-684c7ba9e41b" alt="MovieApp screenshot 3" /> |

| Gallery View | Movie Info | App Preview |
|---|---|---|
| <img width="220" src="https://github.com/user-attachments/assets/7a782ff6-44a5-49d7-bbbf-8e33a047bbaa" alt="MovieApp screenshot 4" /> | <img width="220" src="https://github.com/user-attachments/assets/3191d2ad-0488-47c6-97c2-938ea59283fb" alt="MovieApp screenshot 5" /> | <img width="220" src="https://github.com/user-attachments/assets/4f082c5d-56de-4806-99dd-1d801851953f" alt="MovieApp screenshot 6" /> |

## Features

- Home screen with a scrollable movie list
- Expandable movie cards that show plot, director, actors, and rating
- Detail screen navigation for each movie
- Remote poster and gallery image loading with Coil
- Material 3 UI with a small Compose theme setup
- Custom MovieApp launcher logo
- Native splash screen
- Optimized debug and release APK builds
- Curated built-in movie dataset with rich metadata

## Tech Stack

| Technology | Purpose |
|---|---|
| Kotlin | Primary language |
| Jetpack Compose | UI framework |
| Material 3 | Design system |
| Navigation Compose | Screen navigation |
| Coil 3 | Image loading |
| AndroidX SplashScreen | Native splash screen |
| Gradle Kotlin DSL | Build configuration |

## Release

The first stable release is `v1.0.0`.

[📱 Download APK (v1.0.0)](https://github.com/ahmedazizi3/Movie-App/releases/tag/v1.0.0)

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
