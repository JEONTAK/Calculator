# Calculator

---
## Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기

### Requirement

#### Definition
- [x] 양의 정수(0 포함)입력 받기
  - [x] Scanner 사용 양의 정수 2개 입력 받기
  - [x] 양의 정수는 각각 하나씩 입력
  - [x] 적합합 타입으로 선언한 변수에 저장

- [x] 사칙 연산 기호 입력 받기
  - [x] Scanner 사용 사칙 연산 기호 입력 받기
  - [x] 사칙 연산 기호를 적합한 타입으로 선언한 변수에 저장

- [x] 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
  - [x] 사칙연산 기호에 맞는 연산자 사용하여 연산 진행
  - [x] 입력 받은 연산 기호 구분 위해 제어문 사용

- [x] 반복문 사용 시, exit 문자열 입력 전 까지 반복

- [x] 오류 발생 시, 적절히 처리 후 출력
  - [x] 양의 정수를 제외한 입력 발생
  - [x] 사칙 연산 기호를 제외한 입력 발생
  - [x] 연산 오류 발생
    - [x] 나눗셈 연산에서 분모에 0이 들어가는 경우

#### Design (Pseudocode)
```
while(true){
            Get 2 Integer a, b
            if(2 Integer < 0){
                negativeIntegerExpection
            }

            Get Operation
            if(Operation is not in ('+','-','/','*')){
                notOperationException
            }

            switch(Operation){
                case '+':
                    Print a + b
                case '-':
                    Print a - b
                case '*':
                    Print a * b
                case '/':
                    if(b is 0){
                        denominatorIsZeroException
                    }
                    Print a / b
            }
            
            Get operationAgain
            if(operationAgain is 'exit')
                finish
        }
```

---
## Lv 2. 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기

### Requirement

#### Definition

#### Design

---
## Lv 3. Enum, 제네릭, 람다 & 스트림을 이해한 계산기 만들기

### Requirement

#### Definition

#### Design



---
## Commit Convention

### 형식

```
type(scope) : short summary

[body] 
[footer]
```

<br>type : 커밋의 목적
<br>scope : 변경된 코드의 범위
<br>short summary : 커밋의 간략한 설명
<br>body : 커밋의 자세한 설명
<br>footer : 부가 정보

### type

<br>feat: 새로운 기능 추가.
<br>fix: 버그 수정.
<br>docs: 문서 수정 (README.md, 주석 등).
<br>style: 코드 포맷팅, 세미콜론 누락 등 기능에 영향을 미치지 않는 변경.
<br>refactor: 코드 리팩토링 (기능 변화 없음).
<br>test: 테스트 코드 추가/수정.
<br>chore: 빌드 프로세스 또는 패키지 매니저 설정 수정.
<br>perf: 성능 개선을 위한 변경.
<br>ci: CI 설정 변경.
<br>build: 빌드 관련 파일 변경.

✨ : feat
🐛 : fix
📝 : docs
🔥 : chore
---

## Code Convention

<br>celass name : PascalCase(ex: MyClass)
<br>method and var : camelCase(ex: userName)
<br>const : UPPER_SNAKE_CASE(ex: MAX_LENGTH)

class : 명사형
<br>interface : 형용사 or 명사형
<br>method : 동사형
<br>var : 명사형, 의미 알수 있도록 명확히
<br>들여 쓰기 : 4칸
<br>중괄호 : 한 줄 아래에서 시작
<br>공백 : 연산자, 피연산자 사이에 공백 사용 ex : total = price + tax; / calculateTotal(price, tax);

주석 : 가능하면 JavaDoc 형식 사용

코드 : 클래스 내부 코드는 const, field, constructor, method 순으로 작성

---