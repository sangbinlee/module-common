# BUILD

### SET /module-common/build.gradle
1. bootJar를 비활성화:

	bootJar.enabled = false


1. BUILD 실행:

	sangb@dev9-2 MINGW64 /c/dev9/workspace-spring-tool-suite-4-4.26.0.RELEASE/module-common
	$ ./gradlew clean build

	Welcome to Gradle 8.11.1!

	Here are the highlights of this release:
	 - Parallel load and store for Configuration Cache
	 - Java compilation errors at the end of the build output
	 - Consolidated report for warnings and deprecations

	For more details see https://docs.gradle.org/8.11.1/release-notes.html

	Starting a Gradle Daemon, 1 incompatible Daemon could not be reused, use --status for details
	OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended

	BUILD SUCCESSFUL in 28s
	7 actionable tasks: 6 executed, 1 up-to-date

	sangb@dev9-2 MINGW64 /c/dev9/workspace-spring-tool-suite-4-4.26.0.RELEASE/module-common



1. BUILD 결과 파일 위치 : module-common\build\libs :

	module-common-0.0.1-SNAPSHOT-plain.jar

* 사용할 프로젝트에서 추가하여 사용 / 프로젝트 루트에 libs 폴더 만들고 빌드한 공통모듈 jar를 추가한다. :

	/spring-boot-jsp/libs/module-common-0.0.1-SNAPSHOT-plain.jar

* 사용할 프로젝트 /spring-boot-jsp/build.gradle 파일 수정

	dependencies {
	 	...
		// ####################### 사용할 공통 라이브러리 추가
	    implementation files('libs/module-common-0.0.1-SNAPSHOT-plain.jar')


* 사용할 프로젝트 소스에서 사용

	/spring-boot-jsp/src/main/java/com/dev9/board/college/JspController.java

		import com.dev9.common.Common;

		Common c = new Common();
		String commonTest = c.commonTest();
		log.info("외부 라이브러리 생성 및 추가 후 테스트 commonTest={}", commonTest);

* 공통모듈 수정시마다 빌드해서 jar파일을 복사하는 번거로움이 있다. 귀찮다.

	sangb@dev9-2 MINGW64 /c/dev9/workspace-spring-tool-suite-4-4.26.0.RELEASE/module-common
	$ ./gradlew clean build
	<-------------> 0% CONFIGURING [2s]
	> root project > Resolve files of configuration 'classpath'
* refresh build gradle를 해주어야 implementation한  jar 변경분이 적용된다.


### Guides
The following guides illustrate how to use some features concretely:

* [Validation](https://spring.io/guides/gs/validating-form-input/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

# module-common

# module-common  main-sangbinlee-2 브랜치 테스트
# module-common  main-sangbinlee-2 브랜치 테스트 2