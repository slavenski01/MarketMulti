pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
    }
    
}
rootProject.name = "MarketMulti"


include(":browserApp")
include(":shared")
include(":androidApp")

