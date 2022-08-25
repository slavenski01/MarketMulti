pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    
}
rootProject.name = "MarketMulti"


include(":browserApp")
include(":shared")
include(":androidApp")

