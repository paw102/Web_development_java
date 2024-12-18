package ch19_generic.wildcards;

// 외부에 클래스를 정의함 -> 처음보는 형태이므로 필기
//  주로 사용하게 되는 클래스에는 public 이 붙어있고, 부가적으로 사용되는 클래스의 경우에는 접근 지정자가 명시되어있지 않음.
//  -> 이런 방식으로 시험 문제가 나옴.

import java.util.List;

class Shape{
    public void draw(){
        System.out.println("모양을 그립니다.");
    }
}

class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("원을 그립니다.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw(){
        System.out.println("직사각형을 그립니다.");
    }
}


public class WildcardExample02 {
    //  여기 부분에 wildcard 가 들어감
    public static void drawShapes(List<? extends Shape> shapes) {
        //  List 내부의 요소를 뽑는 반복문
        for (Shape shape : shapes){
            shape.draw();
        }
    }

    public static void main(String[] args) {
        //  이하의 형태도 argument 로 Circle 의 객체를 생성해서 넣은 케이스임
        //  이하의 경우에는 생성된 객체들의 객체명이 없을 뿐임.
        List<Circle> circles = List.of(new Circle(), new Circle());
        List<Rectangle> rectangles = List.of(new Rectangle(), new Rectangle());

        drawShapes(circles);
        drawShapes(rectangles);

        //  List<? extends Shape> 는 Shape 클래스 객체와 그 하위 클래스 (Circle, Rectangle) 의 객체만 받을 수 있음.
        //  shapes 리스트에서 요소를 읽는 것은 안전하지만, 새로운 요소를 추가하려고 하면 컴파일 오류가 생길 수 있음.
    }
}
