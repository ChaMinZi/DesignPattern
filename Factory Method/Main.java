import com.example.factory.Factory;
import com.example.factory.IDCardFactory;
import com.example.factory.Product;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product idCard1 = factory.createProduct("모모");
        Product idCard2 = factory.createProduct("코코");

        idCard1.use();
        idCard2.use();
    }
}

/**
    * IDCard / IDCardFactory의 내용이 많이 변경되어도 
      Main의 code는 수정이 발생하지 않는다.
      ( 객체를 생성하는 메서드는 노출이 되어 있지만 코드는 숨겨져 있어서 )
    * Main에서는 IDCard는 import가 안 되어 있는데 기능을 사용할 수 있다.
      --> 서로 import가 안 되어 있기 때문에 결합도가 떨어진다.
      
    = 결합도를 낮추자! 수정을해도 다른 class에 영향을 주지 말자
**/