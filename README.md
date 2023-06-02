# Android App README

This repository contains the source code for a basic Android app that demonstrates button functionality and push notifications using Firebase Cloud Messaging (FCM).

## Table of Contents

- [Description](#description)
- [Requirements](#requirements)
- [Setup](#setup)
- [Usage](#usage)
- [Design Decisions](#design-decisions)
- [Challenges Faced](#challenges-faced)
- [Contributing](#contributing)
- [License](#license)

## Description

The Android app built in this project consists of a simple user interface with a button and a text field. Clicking the button changes the text in the field to "Hello, World!" Additionally, there is a second button that triggers a push notification to the app using Firebase Cloud Messaging.

## Requirements

To run this project, you need the following:

- Android Studio (version X.X.X)
- An Android device or emulator running Android X.X or higher

## Setup

1. Clone this repository to your local machine using Git or download it as a ZIP file.
2. Open Android Studio and select "Open an Existing Project".
3. Navigate to the project directory and select the project.
4. Wait for Android Studio to sync the project and resolve dependencies.

## Usage

1. Launch the app on your Android device or emulator.
2. The main screen displays a button and a text field.
3. Click the first button to change the text in the field to "Hello, World!".
4. Click the second button to trigger a test push notification to the app.
5. You should receive the push notification on your device/emulator.

## Design Decisions

- Language: The app is developed using [Kotlin](https://kotlinlang.org/) as it offers concise syntax, null safety, and excellent interoperability with existing Java code.
- User Interface: The user interface consists of a single activity with a minimal layout to focus on the core functionality. It includes buttons and a text field, providing a simple and intuitive interaction.
- Firebase Cloud Messaging: Firebase Cloud Messaging is chosen for implementing push notifications due to its robustness, ease of use, and extensive documentation.

## Challenges Faced

During the development of this project, I encountered a few challenges:

1. Setting up Firebase: Configuring Firebase and integrating it with the app required careful attention to detail, including adding the necessary configuration files and dependencies.
2. Handling Push Notifications: Understanding the concepts and APIs related to push notifications took some time, especially when implementing the feature to trigger a test push notification.

These challenges were overcome by referring to the official Android documentation, online tutorials, and reaching out to developer communities for guidance.
