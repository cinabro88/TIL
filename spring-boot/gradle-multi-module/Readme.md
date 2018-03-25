## gradle 로 스프링부트 프로젝트 구성시 멀티모듈을 셋팅해보자.
* 참고 : http://jojoldu.tistory.com/123


### 프로젝트 생성 및 멀티모듈 셋팅
1. module 생성 -> settings.gradle 파일 생성됨.
2. settings.gradle 에 rootProject.name 작성.
3. 각 모듈에 필요한 gradle 작성
4. root 프로젝트의 gradle 에 subprojects 를 작성. 
subprojects 는 settings.gradle 에 include 된 모든 프로젝트를 관리한다.
root 까지 적용하고 싶으면 allprojects 로 적용하면 된다.
5. 서브 모듈간의 의존성을 작성해준다.
```gradle
project(':module-api') {
    dependencies {
        compile project(':module-common')
    }
}

project(':module-web') {
    dependencies {
        compile project(':module-common')
    }
}
```
 

이렇게 하면 끗~!

### 테스트
module-common 의 테스트코드를 작성해보면, 
```text
java.lang.IllegalStateException: Unable to find a @SpringBootConfiguration, you need to use @ContextConfiguration or @SpringBootTest(classes=...) with your test
```
위와같은 에러를 만나게 된다. 해당모듈이 SpringBootApplication 이 정의되지 않았기 때문에, Context 를 불러올 수 없기때문.

테스트를 위한 Application 클래스를 하나 만들어주면 된다.

### 빌드
프로젝트 전체를 빌드해보면, module-common 이 실패하는데
gradle 빌드시에는 각 프로젝트를 실행가능한 jar형태로 만들게 되는데, module-common 프로젝트의 경우 main메소드가 없기 때문.
아래 코드를 module-common의 build.gradle에 추가.

```text
bootJar {
    enabled = false
}

jar {
    enabled = true
}
```

