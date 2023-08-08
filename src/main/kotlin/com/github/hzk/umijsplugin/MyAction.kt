package com.github.hzk.umijsplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class MyAction : AnAction("My Action") {
    override fun actionPerformed(p0: AnActionEvent) {
        Messages.showInfoMessage("test", "test")
    }

}
