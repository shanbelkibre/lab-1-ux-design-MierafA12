# ቱባ (Tuba Ethiopian) - Ethiopian Digital Book & Audiobook App

![Android](https://img.shields.io/badge/Platform-Android-green.svg)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-purple.svg)
![Target SDK](https://img.shields.io/badge/Target%20SDK-37-blue.svg)
![Min SDK](https://img.shields.io/badge/Min%20SDK-24%20(Android%207.0)-orange.svg)
![AGP](https://img.shields.io/badge/AGP-9.5.0-lightgrey.svg)

**ቱባ (Tuba Ethiopian)** is a modern Android mobile application designed for discovering, purchasing, reading, and listening to Ethiopian literature, translations, and audiobooks. Built natively with Kotlin and modern Android SDK practices, the app features full Amharic localization, custom visual design components, and responsive layout structures.

---

## 📱 Features

- **User Authentication & Onboarding**
  - **Splash Screen:** Smooth application launch.
  - **Sign In & Register:** Tabbed login options (Phone Number `+251` & Email), registration form, and password recovery flow.
- **Book Store & Catalog (`Store`)**
  - **Recently Released (`ተለቀቀው የቀረቡ`):** Showcases new book releases.
  - **Popular Books (`ሰምተናል`):** Highlights trending and most listened-to titles.
- **Personal Library & Reader Tabs**
  - **My Books (`የኔ መጻሕፍት`):** Personal collection management.
  - **Listening (`በማዳመጥ ላይ`):** Dedicated audio library player interface.
  - **Reading (`በማንበብ ላይ`):** Reader view for ongoing e-books.
- **Search & Discovery (`Search`)**
  - Real-time search bar with instant clear capabilities.
  - Category filter chips (e.g., Translation `ትርጉም`, Fiction `የልብ ወለድ`).
- **Book Details & Reader Reviews**
  - High-res book cover preview, title, and author overview.
  - Purchase and audio/translation availability badges.
  - Star ratings and interactive user review section.
- **Modern Android UI/UX**
  - Native Edge-to-Edge window handling.
  - Custom vector drawables and background styling.
  - Amharic string localization support.

---

## 🛠️ Tech Stack & Dependencies

- **Language:** Kotlin
- **Build System:** Gradle with Kotlin DSL (`build.gradle.kts`) & Version Catalog (`gradle/libs.versions.toml`)
- **Android Gradle Plugin (AGP):** `9.5.0`
- **Compile / Target SDK:** `37`
- **Min SDK:** `24` (Android 7.0+)
- **UI Components & Libraries:**
  - `com.google.android.material:material:1.14.0` (Material Design 3)
  - `androidx.appcompat:appcompat:1.8.0`
  - `androidx.constraintlayout:constraintlayout:2.1.4`
  - `androidx.activity:activity-ktx:1.13.0`
  - `androidx.core:core-ktx:1.10.1`

---

## 📂 Project Structure

```text
tuba_ethiopian/
├── app/
│   ├── build.gradle.kts           # App-level build configurations
│   └── src/
│       ├── main/
│       │   ├── AndroidManifest.xml # App manifest & Activity declarations
│       │   ├── java/org/dbu/tuba_ethiopian/
│       │   │   ├── SplashActivity.kt    # Launch splash screen handler
│       │   │   ├── LoginActivity.kt     # User sign-in screen
│       │   │   ├── RegisterActivity.kt  # User registration screen
│       │   │   ├── MainActivity.kt      # Main bottom navigation & tab container
│       │   │   ├── SearchActivity.kt    # Book search & filter interface
│       │   │   ├── BookDetailActivity.kt# Detailed book information & reviews
│       │   │   └── AllPageActivity.kt   # Comprehensive design flow layout preview
│       │   └── res/
│       │       ├── drawable/        # Custom rounded buttons, icons, and cards
│       │       ├── layout/          # XML activity & fragment layout files
│       │       └── values/          # Colors, themes, and Amharic string resources
├── gradle/
│   └── libs.versions.toml           # Dependency version catalog
├── build.gradle.kts                 # Root project build configuration
└── README.md                        # Project documentation
```

---

## 🚀 Getting Started

### Prerequisites

- **Android Studio** (Ladybug / 2024.2.1 or newer recommended)
- **JDK 11** or higher
- **Android SDK 37** installed via Android Studio SDK Manager

### Installation & Build

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/tuba_ethiopian.git
   cd tuba_ethiopian
   ```

2. **Open in Android Studio:**
   - Launch Android Studio and choose **Open an Existing Project**.
   - Select the `tuba_ethiopian` root folder.

3. **Build the Project:**
   - Allow Gradle to sync dependencies automatically.
   - Run the assemble command in the terminal or click **Build > Make Project**:
     ```bash
     ./gradlew assembleDebug
     ```

4. **Run on Emulator / Physical Device:**
   - Select a connected device or AVD running Android 7.0 (API 24) or higher.
   - Click the **Run** button (`Shift + F10`) in Android Studio.

---

## 📄 License

This project is maintained for **Tuba Ethiopian Mobile Application**. All rights reserved.
