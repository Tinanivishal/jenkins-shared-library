def call(String url, String branch, String credId) {
    git credentialsId: credId, url: url, branch: branch
}
