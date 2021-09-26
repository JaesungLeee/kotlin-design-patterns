# kotlin-design-patterns

## Software Design Patterns

<br>

* 디자인 패턴
    * 소프트웨어 공학의 한 개념
    * 소프트웨어 설계시 특정 맥락에서 발생하는 고질적 문제들을 효율적으로 해결하기 위해 설계된 해결책
    * 위의 문제들이 지속적으로 발생할 때 재사용할 수 있는 해결책

<br>

* 패턴의 사전적 의미
    * 일정한 형태나 유형
    * 소프트웨어적으로 생각해보았을 때 서로 다른 모듈이나 기능의 소프트웨어를 개발할 때도 공통적인 문제가 존재하며 이를 해결하는 해결책에도 공통점이 있음
    
    <br>

    * 패턴은 공통의 솔루션을 만들어주어 협업 간에 원활한 의사소통을 제공하는 중요한 역할을 함

<br>

* 디자인 패턴의 3요소
    1. Context : 문제가 발생하는 여러 상황 기술
   
    <br>

    2. Problem : 패턴이 적용되어야 할 여러가지 디자인 이슈 기술

    <br>

    3. Solution : 문제를 해결하도록 설계를 구성하는 요소들, 그들 사이의 관계, 책임, 협력 관계를 기술

<br>

* 소프트웨어 디자인 패턴 분류 표

    |패턴|종류|
    |---|---|
    |GoF 패턴 (Gang-of-Four)|`생성 패턴`, `구조 패턴`, `동작 패턴`|
    |동시성 패턴|`반응자 패턴`, `Lock`, `스케줄링`, ...|
    |아키텍쳐 패턴|`MVC`, `MVP`, `MVVM`, `MVI`|

<br>

## GoF 디자인 패턴 (Gang-of-Four)

<br>

* GoF 디자인 패턴
    * 유형, 범위에 따른 분류
    
    <br>

    1. 유형에 따른 분류
        * 생성 패턴 (Creational Pattern)
        * 구조 패턴 (Structural Pattern)
        * 행위 패턴 (Behavioral Pattern)

    <br>

    2. 범위에 따른 분류
        * 클래스 패턴 (Class Pattern)
            * 클래스와 서브클래스 간의 관련성
            * 상속을 통해 관련
            * 컴파일 타임에 결정되는 정적인 성격을 지님
        
        <br>

        * 객체 패턴 (Object Pattern)
            * 각 객체간의 관련성
            * 런타임 내에 변경되는 동적인 성격을 지님
    
    <br>

## 생성 패턴 (Creational Paterns)

<br>

### [추상 팩토리 (Abstract Factory)](https://github.com/JaesungLeee/kotlin-design-patterns/blob/main/GoF-patterns/src/main/kotlin/Creational-Patterns/AbstractFactory.kt)

* 구체적인 클래스에 의존하지 않고 Interface를 통해 서로 연관 및 의존하는 객체들의 그룹으로 생성하여 추상적으로 표현

* 연관된 서브 클래스를 묶어 한번에 교체 가능

<br>

### 빌더 (Builder)

* 동일 순서로 생성되거나 특정 알고리즘을 사용하여 생성되어야 하는 복잡한 객체를 만드는데 사용

* 객체의 생성 과정과 표현 방법 분리

* 동일 객체 생성에도 서로 다른 결과를 만들어 낼 수 있음

<br>

### [팩토리 메소드 (Factory Method)](https://github.com/JaesungLeee/kotlin-design-patterns/blob/main/GoF-patterns/src/main/kotlin/Creational-Patterns/FactoryMethod.kt)

* 객체 생성을 서브 클래스에서 처리하도록 분리하여 캡슐화한 패턴

* 상위 클래스에서는 Interface만 정의, 실제 생성은 서브 클래스가 담당

<br>

### 프로토타입 (Prototype)

* 원본 객체를 복제하는 방법으로 객체를 생성하는 패턴

* 일반적인 방법으로 객체 생성

* 비용이 큰 경우 주로 사용되는 패턴

<br>

### [싱글톤 (Singleton)](https://github.com/JaesungLeee/kotlin-design-patterns/blob/main/GoF-patterns/src/main/kotlin/Creational-Patterns/Singleton.kt)

* 특정 클래스가 하나의 객체만 생성하도록 보장

* 하나의 객체를 생성하면 생성된 객체는 어디서든 참조 가능

* 여러 프로세스가 동시에 참조하는 것은 불가능

* 클래스 내에서 인스턴스가 하나뿐임을 보장

* 불필요한 메모리 낭비 최소화
