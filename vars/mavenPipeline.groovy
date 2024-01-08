def call() {
    pipeline {
        agent any
        stages {
            stage("maven compile") {
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
            stage("maven compile") {
                steps {
                    script {
                        maven(["test"])
                    }
                }
            }
        }
    }
}