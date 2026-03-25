def call(imageName) {
    withCredentials([usernamePassword(credentialsId: 'docker',
        usernameVariable: 'USER', passwordVariable: 'PASS')]) {

        sh 'docker build -t ganeshnalli/myapp:latest .'
        sh 'docker push ganeshnalli/myapp:latest'
    }
}
