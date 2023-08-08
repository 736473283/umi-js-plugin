package com.github.hzk.umijsplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class FirstAction : AnAction("First Action") {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showInfoMessage("test", "test")
    }

}
