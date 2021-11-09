package com.github.ericprud.intellijplatformpluginlombok.services

import com.intellij.openapi.project.Project
import com.github.ericprud.intellijplatformpluginlombok.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
