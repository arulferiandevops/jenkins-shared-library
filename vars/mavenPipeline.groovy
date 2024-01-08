def call() {
    pipeline {
        agent any
        stages {
            stage("maven clean") {
            steps {
                script {
                    maven(["clean"])
                    }
                }
            }
            stage("maven compile") {
                steps {
                    script {
                        maven(["compile"])
                    }
                }
            }
            stage("maven test") {
                steps {
                    script {
                        maven(["test"])
                    }
                }
            }
        }
    }
}