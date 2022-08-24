plugins {
    kotlin("js")
}

group = "me.vkuznetsov"
version = "1.0-SNAPSHOT"



kotlin {
    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}