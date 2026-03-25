def call(imageName) {
    withCredentials([usernamePassword(credentialsId: 'docker',
        usernameVariable: 'USER', passwordVariable: 'PASS')]) {

        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push ${imageName}"
    }
}
