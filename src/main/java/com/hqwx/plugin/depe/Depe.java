package com.hqwx.plugin.depe;

import org.gradle.internal.impldep.org.jetbrains.annotations.NotNull;

public class Depe {

    @NotNull
    public static final String androidGradlePlugin = "com.android.tools.build:gradle:3.6.3";
    @NotNull
    public static final String jdkDesugar = "com.android.tools:desugar_jdk_libs:1.0.9";
    @NotNull
    public static final String rxJava3 = "io.reactivex.rxjava3:rxjava:3.0.13";
    @NotNull
    public static final String rxAndroid3 = "io.reactivex.rxjava3:rxandroid:3.0.0";
    @NotNull
    public static final String gson = "com.google.code.gson:gson:2.8.5";

    public static final class Hqwx {
        private static final String version = "1.0.36";
        @NotNull
        public static final String hqdns = "com.yy.android.educommonlib:hqdns-ok3:1.0.36";
        @NotNull
        public static final String push = "com.yy.android.educommonlib:push-xm:1.0.36";
        @NotNull
        public static final String eduLive = "com.edu24ol.edu:edu:2.1.1";
        @NotNull
        public static final String ylog = "com.yy.android.educommonlib:ylog:1.0.37";
    }

    public static final class PackerNg {
        private static final String version = "2.0.1";
        @NotNull
        public static final String helper = "com.mcxiaoke.packer-ng:helper:2.0.1";
        @NotNull
        public static final String plugin = "com.mcxiaoke.packer-ng:plugin:2.0.1";
    }

    public static final class WMRouter {
        private static final String version = "1.1.2";
        @NotNull
        public static final String router = "com.sankuai.waimai.router:router:1.1.2";
        @NotNull
        public static final String compiler = "com.sankuai.waimai.router:compiler:1.1.2";
        @NotNull
        public static final String plugin = "com.sankuai.waimai.router:plugin:1.1.2";

    }

    public static final class Glide {
        private static final String version = "4.11.0";
        @NotNull
        public static final String glide = "com.github.bumptech.glide:glide:4.11.0";
        @NotNull
        public static final String compiler = "com.github.bumptech.glide:compiler:4.11.0";
    }

    public static final class SmartRefresh {
        private static final String version = "1.1.3";
        @NotNull
        public static final String smartRefreshHorizontal =
                "com.scwang.smartrefresh:SmartRefreshHorizontal:1.0.0-beta-1";
        @NotNull
        public static final String smartRefreshLayout =
                "com.scwang.smartrefresh:SmartRefreshLayout:1.1.3";
        @NotNull
        public static final String smartRefreshHeader =
                "com.scwang.smartrefresh:SmartRefreshHeader:1.1.3";
    }

    public static final class Kotlin {
        private static final String version = "1.4.32";
        @NotNull
        public static final String stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.32";
        @NotNull
        public static final String gradlePlugin =
                "org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32";
        @NotNull
        public static final String extensions =
                "org.jetbrains.kotlin:kotlin-android-extensions:1.4.32";
    }

    public static final class OkHttp {
        private static final String version = "4.9.1";
        @NotNull
        public static final String okhttp = "com.squareup.okhttp3:okhttp:4.9.1";
        @NotNull
        public static final String logging = "com.squareup.okhttp3:logging-interceptor:4.9.1";
    }

    public static final class Retrofit {
        private static final String version = "2.9.0";
        @NotNull
        public static final String retrofit = "com.squareup.retrofit2:retrofit:2.9.0";
        @NotNull
        public static final String adapterRxJava3 = "com.squareup.retrofit2:adapter-rxjava3:2.9.0";
        @NotNull
        public static final String converterGson = "com.squareup.retrofit2:converter-gson:2.9.0";
    }

    public static final class JUnit {
        private static final String version = "4.13";
        @NotNull
        public static final String junit = "junit:junit:4.13";
    }

    public static final class Material {
        @NotNull
        public static final String material = "com.google.android.material:material:1.3.0";
    }

    public static final class Accompanist {
        @NotNull
        public static final String version = "0.13.0";
        @NotNull
        public static final String coil = "com.google.accompanist:accompanist-coil:0.13.0";
        @NotNull
        public static final String insets = "com.google.accompanist:accompanist-insets:0.13.0";
        @NotNull
        public static final String pager = "com.google.accompanist:accompanist-pager:0.13.0";
    }

    public static final class Coroutines {
        private static final String version = "1.4.2";
        @NotNull
        public static final String core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2";
        @NotNull
        public static final String android =
                "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.2";
        @NotNull
        public static final String test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.4.2";
    }

    public static final class AndroidX {
        @NotNull
        public static final String annotation = "androidx.annotation:annotation:1.2.0";
        @NotNull
        public static final String appcompat = "androidx.appcompat:appcompat:1.3.0";
        @NotNull
        public static final String palette = "androidx.palette:palette:1.0.0";
        @NotNull
        public static final String recyclerview = "androidx.recyclerview:recyclerview:1.2.1";
        @NotNull
        public static final String viewPager2 = "androidx.viewpager2:viewpager2:1.0.0";
        @NotNull
        public static final String coreKtx = "androidx.core:core-ktx:1.5.0";
        @NotNull
        public static final String cardView = "androidx.cardview:cardview:1.0.0";

        private AndroidX() {
        }

        public static final class Fragment {
            private static final String version = "1.3.4";
            @NotNull
            public static final String fragment = "androidx.fragment:fragment:1.3.4";
            @NotNull
            public static final String fragmentKtx = "androidx.fragment:fragment-ktx:1.3.4";
        }

        public static final class Work {
            @NotNull
            public static final String workRuntime = "androidx.work:work-runtime:2.2.0";
        }

        public static final class Activity {
            private static final String activity_version = "1.2.3";
            @NotNull
            public static final String activity = "androidx.activity:activity:1.2.3";
            @NotNull
            public static final String activityKtx = "androidx.activity:activity-ktx:1.2.3";
            @NotNull
            public static final String activityCompose =
                    "androidx.activity:activity-compose:1.3.0-rc01";
        }

        public static final class Constraint {
            @NotNull
            public static final String constraintLayoutCompose =
                    "androidx.constraintlayout:constraintlayout-compose:1.0.0-alpha08";
            @NotNull
            public static final String constraintLayout =
                    "androidx.constraintlayout:constraintlayout:2.0.4";
        }

        public static final class Compose {
            @NotNull
            public static final String snapshot = "";
            @NotNull
            public static final String version = "1.0.0-rc01";
            @NotNull
            public static final String runtime = "androidx.compose.runtime:runtime:1.0.0-rc01";
            @NotNull
            public static final String foundation =
                    "androidx.compose.foundation:foundation:1.0.0-rc01";
            @NotNull
            public static final String layout =
                    "androidx.compose.foundation:foundation-layout:1.0.0-rc01";
            @NotNull
            public static final String ui = "androidx.compose.ui:ui:1.0.0-rc01";
            @NotNull
            public static final String material = "androidx.compose.material:material:1.0.0-rc01";
            @NotNull
            public static final String materialIconsExtended =
                    "androidx.compose.material:material-icons-extended:1.0.0-rc01";
            @NotNull
            public static final String tooling = "androidx.compose.ui:ui-tooling:1.0.0-rc01";
        }

        public static final class Lifecycle {
            private static final String version = "2.3.1";
            @NotNull
            public static final String viewModelCompose =
                    "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07";
            @NotNull
            public static final String viewModel =
                    "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1";
        }

        public static final class Test {
            private static final String version = "1.3.0";
            @NotNull
            public static final String core = "androidx.test:core:1.3.0";
            @NotNull
            public static final String rules = "androidx.test:rules:1.3.0";
            @NotNull
            public static final String espressoCore = "androidx.test.espresso:espresso-core:3.2.0";

            public static final class Ext {
                private static final String version = "1.1.2";
                @NotNull
                public static final String junitKtx = "androidx.test.ext:junit-ktx:1.1.2";
                @NotNull
                public static final String junit = "androidx.test.ext:junit:1.1.2";
            }
        }

        public static final class Room {
            private static final String version = "2.3.0";
            @NotNull
            public static final String runtime = "androidx.room:room-runtime:2.3.0";
            @NotNull
            public static final String ktx = "androidx.room:room-ktx:2.3.0";
            @NotNull
            public static final String compiler = "androidx.room:room-compiler:2.3.0";
            @NotNull
            public static final String rxjava3 = "androidx.room:room-rxjava3:2.3.0";
            @NotNull
            public static final String guava = "androidx.room:room-guava:2.3.0";
            @NotNull
            public static final String testing = "androidx.room:room-testing:2.3.0";
        }
    }


}
