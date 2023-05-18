# UML

+ UML 軟體設計圖

    UML 是 Unified Modeling Language 的縮寫，它是「統一塑模語言」，可以用來幫程式畫設計圖

    1. 使用案例圖
    2. 類別圖
    3. 物件圖
    4. 順序圖
    5. 部署圖\
    ...

***

+ UML 類別圖

    |類別圖|
    |:---:|
    |類別名稱|
    |屬性 (資料)|
    |方法 (功能、操作)|

***

+ 範例

    存取限定
    1. private (-)
    2. protected (+)
    3. public (#)

    |Circle|
    |:---|
    |- area:double|
    |- radius:double|
    |+ Circle (radius:double)|
    |+ setRadius (radius:double)|
    |+ getRadius( ):double |
    |+ getArea( ):double |

