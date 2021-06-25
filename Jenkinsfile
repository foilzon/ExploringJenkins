node{
    stage("build")
    sh "gradlew clean build"
    jacoco(
            classPattern: '**/classes/java/main',
            sourcePattern: '**/src/main/java',
            sourceInclusionPattern: '**/*.java'
    )
}