package com.github.mraj0045.mvvmandroidplugin.services

import com.intellij.openapi.project.Project
import com.github.mraj0045.mvvmandroidplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
