def call(String url, String branch, String credId) {
    withCredentials([string(credentialsId: credId, variable: 'GIT_TOKEN')]) {
        def authUrl = url.replace('https://', "https://${GIT_TOKEN}@")
        git url: authUrl, branch: branch
    }
}
