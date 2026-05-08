# ai-java

Java 기초 문법과 간단한 GUI 프로그램을 연습하기 위한 IntelliJ Java 학습 프로젝트입니다.

## 1. 프로젝트 소개

이 프로젝트는 Java의 기본 실행 구조, `main()` 메서드, 콘솔 출력, 그리고 Java Swing을 이용한 간단한 화면 프로그램을 학습하기 위해 만들어졌습니다.

현재는 기본 출력 예제와 간단한 계산기 예제가 포함되어 있습니다.

## 2. 프로젝트 구조

```text
ai-java
├─ src
│  └─ test
│     ├─ Main.java
│     └─ SimpleCalculator.java
├─ .gitignore
├─ ai-java.iml
└─ README.md
```

`src/test` 폴더는 `test` 패키지에 해당합니다.

## 3. 실행 방법

IntelliJ IDEA에서 실행하는 경우:

1. 프로젝트를 IntelliJ IDEA로 엽니다.
2. 실행하려는 Java 파일을 엽니다.
3. `main()` 메서드 옆의 실행 버튼을 클릭합니다.

터미널에서 실행하는 경우:

1. 프로젝트 루트 폴더로 이동합니다.
2. `javac` 명령어로 Java 파일을 컴파일합니다.
3. `java` 명령어로 패키지명을 포함한 클래스 이름을 실행합니다.

## 4. 현재 작성된 Java 파일 설명

### Main.java

가장 기본적인 Java 실행 예제입니다.

`main()` 메서드에서 아래 문장을 콘솔에 출력합니다.

```text
Hello Codex
```

### SimpleCalculator.java

Java Swing으로 만든 간단한 계산기 프로그램입니다.

기능:

- 두 숫자 입력
- 덧셈, 뺄셈, 곱셈, 나눗셈
- 계산 결과 화면 표시
- 0으로 나누기 방지
- 잘못된 숫자 입력 안내

## 5. 컴파일 및 실행 명령어

### Main.java 실행

```powershell
javac .\src\test\Main.java
java -cp .\src test.Main
```

### SimpleCalculator.java 실행

```powershell
javac .\src\test\SimpleCalculator.java
java -cp .\src test.SimpleCalculator
```

## 6. 학습 목적

이 프로젝트를 통해 다음 내용을 연습할 수 있습니다.

- Java 프로젝트 기본 구조 이해
- 패키지와 클래스의 관계 이해
- `main()` 메서드 실행 흐름 이해
- 콘솔 출력 연습
- Java Swing 기초 사용법 학습
- 간단한 이벤트 처리와 조건문 활용
- 터미널에서 Java 컴파일 및 실행 연습

## 7. 참고할 만한 사이트 링크

- Java 공식 문서: https://docs.oracle.com/en/java/
- Java 튜토리얼: https://docs.oracle.com/javase/tutorial/
- IntelliJ IDEA 문서: https://www.jetbrains.com/help/idea/
- Java Swing 튜토리얼: https://docs.oracle.com/javase/tutorial/uiswing/
