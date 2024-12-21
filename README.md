# Flutter Firebase Authentication

A Flutter application demonstrating Firebase authentication features including email signup, login, and email verification.

## Prerequisites

Before starting, ensure you have the following VS Code extensions installed:
- Flutter
- Dart
- Flutter Widget Snippets
- Gradle for Java

## Project Setup

1. Create a new Flutter project in VS Code:
   - Press `Ctrl/Cmd + Shift + P`
   - Type "Flutter"
   - Select "Flutter: New Project"

![Flutter New Project](https://github.com/user-attachments/assets/d09bbe65-6886-4ef3-b9d7-1aa95bb9da85)

   - Test the template app on an emulator or physical device (with USB debugging enabled)

## Project Structure

```
lib/
├── main.dart              # Entry point for the app
├── screens/               # Folder for all screens (pages)
│   ├── login_screen.dart  # Login screen
│   ├── signup_screen.dart # Signup screen
│   └── home_screen.dart   # Home screen
├── widgets/               # Custom widgets used across screens
│   ├── custom_button.dart # Custom button widget
│   └── text_field.dart    # Custom text field widget
├── services/              # Business logic, API calls, authentication
│   ├── auth_service.dart  # Authentication logic
│   └── api_service.dart   # API calls
└── models/               # Data models
    ├── user.dart         # User model
    └── api_response.dart # API response model
```

## Firebase Configuration

1. Go to [Firebase Console](https://console.firebase.google.com) and create a new project

![Create Firebase Project](https://github.com/user-attachments/assets/31b2be8b-6485-4894-9136-d5c15d64b251)

2. Select your preferred app type:

![Select App Type](https://github.com/user-attachments/assets/46385fae-77b1-45c5-9039-d7f15b2989c0)

3. Configure Android App:

![Android Configuration](https://github.com/user-attachments/assets/73c96128-9ff6-4582-8e3c-a54390839346)

   - Enter the Android package name (must match your Flutter project)
   - Verify/update the package name in `android/app/build.gradle`:
     ```gradle
     namespace = "your.package.name"
     ```
   - Update `android/app/src/main/AndroidManifest.xml`:

![Manifest Configuration](https://github.com/user-attachments/assets/301b7a28-6c01-4f42-b1d1-eb631cd134a4)

     ```xml
     <manifest xmlns:android="http://schemas.android.com/apk/res/android"
         package="your.package.name">
     ```

4. Download and add the `google-services.json` file:

![Download Config File](https://github.com/user-attachments/assets/c793097e-2733-4991-856f-f068046cf1b0)

   - Place it in the `android/app` directory

5. Add Firebase Dependencies:

![Firebase Dependencies](https://github.com/user-attachments/assets/139a2938-c9fc-4b05-9eee-9edba3c04176)

   - Update `pubspec.yaml`:
     ```yaml
     dependencies:
       firebase_core: ^2.17.0
       firebase_auth: ^5.8.0
     ```

6. Update Gradle Configuration:
   - In `android/settings.gradle`, add:

![Settings Gradle](https://github.com/user-attachments/assets/0d9ef466-1ad1-45e3-8293-2d0c17df078e)

     ```gradle
     id 'com.google.gms.google-services' version '4.4.2' apply false
     ```
   - In `android/app/build.gradle`, add:

![App Gradle](https://github.com/user-attachments/assets/a930104c-e7a0-4653-8385-3cd5ae851b1b)

     ```gradle
     id 'com.google.gms.google-services'
     ```

7. Continue to Firebase Console:

![Firebase Console](https://github.com/user-attachments/assets/4076769b-0309-47ea-afd9-1e1c66297492)

## Firebase Authentication Setup

1. In Firebase Console:

![Authentication Setup](https://github.com/user-attachments/assets/67c3c012-4bc7-4f58-942f-e81c36267975)

   - Go to Authentication section
   - Click "Get Started"

![Email Authentication](https://github.com/user-attachments/assets/9608d4f6-e4b3-46bd-aac3-42f05791f1a7)

   - Enable Email/Password authentication method

![Enable Email Auth](https://github.com/user-attachments/assets/edcbfee9-7a27-4844-b9f3-c97d4a05d566)

## Features

- User Registration
- Email Verification
- User Login
- Navigation to Home Page after successful authentication

## Testing

After implementing the authentication logic, test the following functionality:
- User registration
- Email verification process
- User login
- Navigation to home page after successful authentication
