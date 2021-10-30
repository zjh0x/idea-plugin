package com.github.zjh0x.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.zjh0x.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
