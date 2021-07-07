package com.hqwx.plugin.depe;

public class Depe {

    public static final String androidGradlePlugin = "com.android.tools.build:gradle:3.6.3";

    public static final String jdkDesugar = "com.android.tools:desugar_jdk_libs:1.0.9";

    public static final String rxJava3 = "io.reactivex.rxjava3:rxjava:3.0.13";

    public static final String rxAndroid3 = "io.reactivex.rxjava3:rxandroid:3.0.0";

    public static final String gson = "com.google.code.gson:gson:2.8.5";

    public static final class PackerNg {
        private static final String version = "2.0.1";

        public static final String helper = "com.mcxiaoke.packer-ng:helper:"+version;

        public static final String plugin = "com.mcxiaoke.packer-ng:plugin:"+version;
    }

    public static final class WMRouter {
        private static final String version = "1.1.2";

        public static final String router = "com.sankuai.waimai.router:router:"+version;

        public static final String compiler = "com.sankuai.waimai.router:compiler:"+version;

        public static final String plugin = "com.sankuai.waimai.router:plugin:"+version;

    }

    public static final class Glide {
        private static final String version = "4.11.0";

        public static final String glide = "com.github.bumptech.glide:glide:"+version;

        public static final String compiler = "com.github.bumptech.glide:compiler:"+version;
    }

    public static final class SmartRefresh {
        private static final String version = "1.1.3";

        public static final String smartRefreshHorizontal =
                "com.scwang.smartrefresh:SmartRefreshHorizontal:1.0.0-beta-1";

        public static final String smartRefreshLayout =
                "com.scwang.smartrefresh:SmartRefreshLayout:"+version;

        public static final String smartRefreshHeader =
                "com.scwang.smartrefresh:SmartRefreshHeader:"+version;
    }

    public static final class Kotlin {
        private static final String version = "1.4.32";

        public static final String stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:"+version;

        public static final String gradlePlugin =
                "org.jetbrains.kotlin:kotlin-gradle-plugin:"+version;

        public static final String extensions =
                "org.jetbrains.kotlin:kotlin-android-extensions:"+version;
    }

    public static final class OkHttp {
        private static final String version = "4.9.1";

        public static final String okhttp = "com.squareup.okhttp3:okhttp:" + version;

        public static final String logging = "com.squareup.okhttp3:logging-interceptor:" + version;
    }

    public static final class Retrofit {
        private static final String version = "2.9.0";

        public static final String retrofit = "com.squareup.retrofit2:retrofit:" + version;

        public static final String adapterRxJava3 =
                "com.squareup.retrofit2:adapter-rxjava3:" + version;

        public static final String converterGson =
                "com.squareup.retrofit2:converter-gson:" + version;
    }

    public static final class JUnit {
        private static final String version = "4.13";

        public static final String junit = "junit:junit:" + version;
    }

    public static final class Material {

        public static final String material = "com.google.android.material:material:1.3.0";
    }

    public static final class Accompanist {

        public static final String version = "0.13.0";

        public static final String coil = "com.google.accompanist:accompanist-coil:" + version;

        public static final String insets = "com.google.accompanist:accompanist-insets:" + version;

        public static final String pager = "com.google.accompanist:accompanist-pager:" + version;
    }

    public static final class Coroutines {
        private static final String version = "1.4.2";

        public static final String core =
                "org.jetbrains.kotlinx:kotlinx-coroutines-core:" + version;

        public static final String android =
                "org.jetbrains.kotlinx:kotlinx-coroutines-android:" + version;

        public static final String test =
                "org.jetbrains.kotlinx:kotlinx-coroutines-test:" + version;
    }

    public static final class AndroidX {

        public static final String annotation = "androidx.annotation:annotation:1.2.0";

        public static final String appcompat = "androidx.appcompat:appcompat:1.3.0";

        public static final String palette = "androidx.palette:palette:1.0.0";

        public static final String recyclerview = "androidx.recyclerview:recyclerview:1.2.1";

        public static final String viewPager2 = "androidx.viewpager2:viewpager2:1.0.0";

        public static final String coreKtx = "androidx.core:core-ktx:1.5.0";

        public static final String cardView = "androidx.cardview:cardview:1.0.0";

        private AndroidX() {
        }

        public static final class Fragment {
            private static final String version = "1.3.4";

            public static final String fragment = "androidx.fragment:fragment:"+version;

            public static final String fragmentKtx = "androidx.fragment:fragment-ktx:"+version;
        }

        public static final class Work {
            public static final String workRuntime = "androidx.work:work-runtime:2.2.0";
        }

        public static final class Activity {
            private static final String version = "1.2.3";

            public static final String activity = "androidx.activity:activity:"+version;

            public static final String activityKtx = "androidx.activity:activity-ktx:"+version;

            public static final String activityCompose =
                    "androidx.activity:activity-compose:1.3.0-rc01";
        }

        public static final class Constraint {

            public static final String constraintLayoutCompose =
                    "androidx.constraintlayout:constraintlayout-compose:1.0.0-alpha08";

            public static final String constraintLayout =
                    "androidx.constraintlayout:constraintlayout:2.0.4";
        }

        public static final class Compose {

            public static final String snapshot = "";

            public static final String version = "1.0.0-rc01";

            public static final String runtime = "androidx.compose.runtime:runtime:"+version;

            public static final String foundation =
                    "androidx.compose.foundation:foundation:"+version;

            public static final String layout =
                    "androidx.compose.foundation:foundation-layout:"+version;

            public static final String ui = "androidx.compose.ui:ui:"+version;

            public static final String material = "androidx.compose.material:material:"+version;

            public static final String materialIconsExtended =
                    "androidx.compose.material:material-icons-extended:"+version;

            public static final String tooling = "androidx.compose.ui:ui-tooling:"+version;
        }

        public static final class Lifecycle {
            private static final String version = "2.3.1";

            public static final String viewModelCompose =
                    "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07";

            public static final String viewModel =
                    "androidx.lifecycle:lifecycle-viewmodel-ktx:"+version;
        }

        public static final class Test {
            private static final String version = "1.3.0";

            public static final String core = "androidx.test:core:"+version;

            public static final String rules = "androidx.test:rules:"+version;

            public static final String espressoCore = "androidx.test.espresso:espresso-core:3.2.0";

            public static final class Ext {
                private static final String version = "1.1.2";

                public static final String junitKtx = "androidx.test.ext:junit-ktx:"+version;

                public static final String junit = "androidx.test.ext:junit:"+version;
            }
        }

        public static final class Room {
            private static final String version = "2.3.0";

            public static final String runtime = "androidx.room:room-runtime:"+version;

            public static final String ktx = "androidx.room:room-ktx:"+version;

            public static final String compiler = "androidx.room:room-compiler:"+version;

            public static final String rxjava3 = "androidx.room:room-rxjava3:"+version;

            public static final String guava = "androidx.room:room-guava:"+version;

            public static final String testing = "androidx.room:room-testing:"+version;
        }
    }


}
