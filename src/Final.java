


// 사용할 소스코드.

/*아래 코드는 현재 final 클래스이다. ---1번 문제
 * 멤버변수도 final이어서 상수이다. -----2번 문제
 * 메서드도 final이어서 변경 및 오버라이딩이 불가하다. -----3번문제
 * */

/*final class Final {
    final int MAX_SIZE = 105;

    final void getMaxSize() {
        final int LV = MAX_SIZE;
        System.out.println(LV);
    }
}*/
//--------------위의 클래스를 복사 함-----------------------


//---------------문제 1번 (final 클래스 상속으로 만들기)---------------------

/*final이 붙은 클래스는 상속이 불가능하다.*/
/*final class Final {
    final int MAX_SIZE = 105;

    final void getMaxSize() {
        final int LV = MAX_SIZE;
        System.out.println(LV);
    }
}*/

//상속 불가
/*class first extends Final{

}*/

//해결 방법
/*상속할 클래스가 final이라면 final을 없애 주면 상속 가능하다.
* 다만 final을 쓰는 이유는 말 그대로 마지막!을 뜻하기에 상속을 한다면 이 클래스는 마지막 클래스라고
* 할 수 없다.*/


/*해결 예시*/
/*class Final {
    final int MAX_SIZE = 105;

    final void getMaxSize() {
        final int LV = MAX_SIZE;
        System.out.println(LV);
    }
}
class first extends Final {
}*/


//----------문제 2번 (상수를 변수로 바꾸기)------------------



/*final class Final {
    final int MAX_SIZE = 105;

    final void getMaxSize() {
        final int LV = MAX_SIZE;
        System.out.println(LV);
    }
}*/
/*final class Final {
    final int MAX_SIZE = 105;

    final void getMaxSize() {
        final int LV = MAX_SIZE;
        System.out.println(LV);
    }
}

class Var{
    public static void main(String[] args) {
        Final f1 = new Final();
        f1.MAX_SIZE = 5;        // 위의 코드 final int Max_SIZE가 상수다. 그래서 변경 불가능.
        System.out.println(f1.MAX_SIZE);
    }
}*/

/*문제 해결*/

/*
final class Final {
*/
/*
    final int MAX_SIZE = 105; final 제거.
*//*

    int MAX_SIZE = 105;

    final void getMaxSize() {
        final int LV = MAX_SIZE;
        System.out.println(LV);
    }
}

class Var{
    public static void main(String[] args) {
        Final f1 = new Final();
        f1.MAX_SIZE = 5;        // 변경 가능.
        System.out.println(f1.MAX_SIZE);
    }
}*/

/*final class Final {

*//*
    final int MAX_SIZE = 105; final 제거.
*//*

    final int MAX_SIZE = 105;

    final void getMaxSize() {
        final int LV = MAX_SIZE;
        System.out.println(LV);
    }
}*/

    /*클래스와 메서드는 연관성이 깊다.
    * 근본적으로 클래스가 final이면 수정자체가 안된다.
    * 변경하려면 클래스의 final을 먼저 제거한다.
    * 대신 final이 제거되면 final의 효과는 사라진다.
    * 인스턴스 멤버 모두 클래스에 영향을 받기에 클래스의 접근 제어자의 선택이 중요하다.*/


/*1. 클래스 접근제어자 final을 없앤다.
* 2. 메소드의 final을 없앤다.
* 3. 상속 클래스를 만들 수 있다.(만든다.)
* 4. 상속 클래스의 같은 이름의 메서드를 만들고 오버라이딩한다.*/
/*class Final {           //1

*//*
    final int MAX_SIZE = 105; final 제거.
*//*

    int MAX_SIZE = 105;

    void getMaxSize() {     //2
        final int LV = MAX_SIZE;
        System.out.println(LV);
    }
}
final class RealFinal extends Final{        //3
    final int MAX_SIZE = 100;

    final void getMaxSize() {        //4
        final int LV = MAX_SIZE;
        System.out.println(LV);
    }

    public static void main(String[] args) {
        RealFinal r1 = new RealFinal();
        r1.getMaxSize();
    }
}*/




//-----------문제 5-----------------

/*생성자를 이용한 final 멤버 변수의 초기화*/

class Card{

    //NUMBER, KIND = 상수.
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;


    //생성자를 통한 상수값 변경.
    Card(String kind, int num){
        KIND = kind;
        NUMBER = num;
    }
    Card(){
        this("HEART", 1);
    }
    public String toString()    {
        return KIND + " " + NUMBER;
    }
}

class FinalCardTest{
    public static void main(String[] args) {
        Card c = new Card();
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        Card c2 = new Card("LOVE",6);
        System.out.println(c2.KIND);
        System.out.println(c2.NUMBER);
    }
}

/*접근 제어자 final과 그외 제어자 static의 차이를 모호하게 만드는 부분이 해결이된다.
* static은 final과 달리 생성자에서도 static 멤버변수는 자체가 인스턴스변수가 아니기에
* 변경자체가 불가능하다.*/