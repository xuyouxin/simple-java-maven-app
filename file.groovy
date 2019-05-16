#!groovy

def firstTest() {
    node('test-node') {
        stage('test1') {
            echo "test1 haha"
        }

        stage('test2') {
            echo "this is test2"
        }
    }
}