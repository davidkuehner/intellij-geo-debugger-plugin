package com.github.davidkuehner.intellijgeodebuggerplugin.services

import com.github.davidkuehner.intellijgeodebuggerplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
