package com.github.mikesafonov.jenkins.linter

/**
 * @author Mike Safonov
 */

class LinterResponse(code: Int, val message: String) : JenkinsResponse(code)

data class JenkinsCrumb(val crumb: String, val crumbRequestField: String)

open class JenkinsResponse(val code: Int) {
    val success: Boolean
        get() = code == 200
}
