#헤드퍼스트 디자인패턴 개정판

- 디자인 패턴 원칙
  1. 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분과 분리한다.
  2. 구현보다는 인터페이스에 맞춰서 프로그래밍한다.
  3. 상속보다는 구성을 활용한다.
  4. 상호작용하는 객체 사이에는 가능하면 느슨한 결합을 사용해야 한다.
  5. 클래스는 확장에는 열려있어야 하지만 변경에는 닫혀 있어야 한다.(Open-Closed Principle)
  6. 추상화된 것에 의존하게 만들고 구상 클래스에 의존하지 않게 만든다.(의존성 뒤집기 원칙 - Dependency Inversion Principle)

- 디자인 패턴을 얘기할 때, "인터페이스를 구현한다" 라는 표현이 나온다고 해서 항상 "클래스를 선언하는 부분에 implements 를 써서 구현하는 클래스를 만든다" 라고
  생각하면 안됩니다. 일반적으로 어떤 상위 형식(클래스와 인터페이스)에있는 구상 클래스는 그 상위 형식의 '인터페이스를 구현하는' 클래스라고 생각하면 됩니다.

---
- 전략 패턴(Strategy pattern)
  - 알고리즘을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해줍니다.
  - 전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있습니다.

---
- 옵저버 패턴(Observer pattern)
  - 신문사 + 구독자 = 옵저버 패턴 
  - 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다 의존성을 정의합니다.

---
- 데코레이터 패턴(Decorator pattern)
  - 객체의 추가 요소를 동적으로 더할 수 있습니다.
  - 데코레이터를 사용하면 서브클래스를 만들 때보다 훨씬 유연하게 기능을 확장할 수 있습니다.
  
  - 특징 
    - 자신이 자익하고 있는 객체에게 어떤 행동을 위임하는 일 말고도 추가 작업을 수행할 수 있습니다.
  - 단점
    - 잡다한 클래스가 너무 많아 진다.
  
---
- 팩토리 메소드 패턴(Factory Method pattern)
  - 간단한 팩토리는 디자인 패턴이라기 보다는 프로그래밍에 자주 쓰이는 **관용구** 에 가깝다.
  - 정의
    - 객체를 생성할 때 필요한 인터페이스를 만듭니다.
    - 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정합니다.
    - 팩토리 메소드 패턴을 사용하면 클래스 인스턴스 만드는 일을 서브클래에게 맡기게 됩니다.

- 추상 팩토리 패턴(Abstract Factory Pattern)
  - 구상 클래스에 의존하지 않고도 서로 연관되거나 의존적인 객체로 이루어진 제품군을 생산하는 인터페이스를 제공합니다.
  - 구상 클래스는 서브클래스에서 만듭니다.
---




  