# crawler_example
crawler example use spring boot & spring batch with beautiful soup4
나도 브랜치 땄음

------

## Gradle Multi Modules 참고 자료 
  * https://jojoldu.tistory.com/123
  * http://woowabros.github.io/study/2019/07/01/multi-module.html

------
## 해야할 일들
1. 그래들 세팅 어떻게..?
- https://jahyun-dev.github.io/posts/gradle-1/
2. 아래 파이썬 어플리케이션 자바로 컨버팅 하기 (/w Spring Batch)
- https://github.com/whitebluecloud/padp_ko/tree/master/dduckchul/0_1_crawl_dragon_mountain : 파이썬 이전에 정리해둔것
- https://spring.io/guides/gs/batch-processing/#scratch : 스프링 배치 예제 그대로 실행하기
3. 스프링 웹앱으로 배치 실행할수 있게 만들기 (/w Spring MVC)

-------

## Modules setting 

### JAVA VERSION : JAVA11

1. crawler_batch
* spring-batch
2. crawler_webapp
* spring-mvc (spring boot)
3. crawler_common
* lombok : https://projectlombok.org/ (IntelliJ / 이클립스 사용시 플러그인 설치 필요)

