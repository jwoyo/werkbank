package com.github.jwoyo.werkbank.services

import com.intellij.openapi.project.Project
import com.github.jwoyo.werkbank.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
