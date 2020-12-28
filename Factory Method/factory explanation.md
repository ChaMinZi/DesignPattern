# Factory Method

#### 객체를 생성하는 과정을 분리하여 불필요한 의존성을 없애는 방법

클래스이 인스턴스를 만드는 일을 서브클래스에게 맡긴다!!! ( 어떤 서브클래스를 사용하냐에 따라서 생산되는 객체 인스턴스가 결정된다. )

-----------------

* Android에서 주로 사용하는 간편한? 방법

  * 따로 Factory 클래스를 선언하지 않고 내부에 static 메서드로 선언하는 경우도 있다. 
( interface를 만들어서 다 추상화 해 두는 것이 좋지만 따로 관리하기 어렵기도 해서 만들고자 하는 객체 내부에 선언하는 경우도 있다. 개발의 편의성을 위해서? )

  * 아래의 경우 객체 내부에 있는 create를 통해서 객체를 생성하기 때문에 결합도가 낮춰지지 않는다. 

```c++
public class IDCard implements Product {
    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }
    
    @Override
    public void use() {
        System.out.println();
    }
    
    public static class Factory {
      public static IDCard create(String owner) {
        return new IDCard(owner);
      }
    }
}
```
