plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "local.notepad"
    compileSdk = 35

    defaultConfig {
        applicationId = "local.notepad"
        minSdk = 29
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }

    packaging {
        resources {
            exclude("META-INF/DEPENDENCIES")
        }
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(libs.itext7.core)
    implementation(libs.poi)
    implementation (libs.room.runtime)
    annotationProcessor (libs.androidx.room.compiler)
    implementation("com.google.api-client:google-api-client-android:2.2.0") { // Replace with the actual dependency
        exclude(group = "commons-logging", module = "commons-logging")
    }
    implementation("com.google.api-client:google-api-client-gson:2.2.0") { // Replace with the actual dependency
        exclude(group = "commons-logging", module = "commons-logging")
    }
    implementation("com.google.api-client:google-api-client:2.2.0") { // Replace with the actual dependency
        exclude(group = "commons-logging", module = "commons-logging")
    }

}