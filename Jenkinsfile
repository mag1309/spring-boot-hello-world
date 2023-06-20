node{
  stage('Git Checkout'){
    git 'https://github.com/mag1309/spring-boot-hello-world/'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
