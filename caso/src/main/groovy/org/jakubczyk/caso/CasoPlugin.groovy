package org.jakubczyk.caso;

import org.gradle.api.Plugin
import org.gradle.api.Project

class CasoPlugin implements Plugin<Project> {

    File homeDirectory

    @Override
    void apply(Project target) {

        homeDirectory = new File(System.getProperty("user.home"))

        /** TODO:
         1. setup android-sdk directory
         a) from ANDROID_HOME
         b) from local.properties
         c) auto setup
         2. Apply licenses
         a) from directory, default "licenses" in rootProject
         b) from ENVs
         3. Download android tools
         a) check for OS and setup links
         b) download the zip to temp directory
         c) uncompress to .android-sdk directory
         d) setup executable
         4. Create CasoConifugration
         a) gather which extra repositories to download
         b) download repositories
         c) for no configuration download all repositories
         */
    }
}
