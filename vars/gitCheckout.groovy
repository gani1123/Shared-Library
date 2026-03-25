def call(String repoUrl, String branch='main') {
    echo "Cloning repo: ${repoUrl}"
    git branch: branch, url: repoUrl
}