plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

    //Room
    id("com.google.devtools.ksp")

    //firebase
    id("com.google.gms.google-services") version "4.4.3" apply false

}

android {
    namespace = "com.example.data_central"
    compileSdk = 36

    defaultConfig {
        minSdk = 26

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:33.3.0"))
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.firebase:firebase-firestore-ktx")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
   // implementation(libs.firebase.firestore.ktx)
    implementation(libs.androidx.room.common.jvm)
    //implementation(libs.google.firebase.firestore.ktx)
    implementation(libs.androidx.navigation.runtime.ktx)
    implementation(libs.androidx.runtime)
    implementation(libs.androidx.navigation.compose)
    //implementation(libs.google.firebase.firestore.ktx)
    //implementation(libs.google.firebase.firestore.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.androidx.activity.compose)
    androidTestImplementation(platform(libs.androidx.compose.bom))



    //Room
    implementation("androidx.room:room-runtime:2.7.2")
    implementation("androidx.room:room-ktx:2.7.2")
    ksp("androidx.room:room-compiler:2.7.2")


    //Firebase



}
//firebase
