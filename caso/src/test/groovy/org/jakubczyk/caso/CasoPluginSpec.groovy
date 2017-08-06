package org.jakubczyk.caso

import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class CasoPluginSpec extends Specification {

    def "should read home directory"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.pluginManager.apply 'org.jakubczyk.caso'

        then:
        project.plugins.findPlugin(CasoPlugin).homeDirectory.exists()
    }

}
