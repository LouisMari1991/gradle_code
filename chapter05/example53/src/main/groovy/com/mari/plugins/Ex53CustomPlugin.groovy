package com.mari.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.BasePlugin

class Ex53CustomPlugin implements Plugin<Project>{


    @Override
    void apply(Project target) {
        target.task('ex53CustomTask') << {
            group BasePlugin.BUILD_GROUP
            println "这是一个通过自定义插件方式创建的任务"
        }
    }


}