Задача: создать и разместить на экране устройства 100 объектов размером 80dp.
Инструкция.
1.	Создайте в отдельном файле разметки item.xml элемент startView размером 80dp.
2.	Установите отступ сверху
3.	В activity_main.xml создайте ScrollView, а внутри него LinearLayout вертикальный.
4.	Задайте контейнеру LinearLayout высоту wrap_content и id как content.
5.	В MainActivity.kt найдите LinearLayout по его id.
6.	Создайте 100 объектов item.xml через метод inflate.
7.	Добавьте все 100 созданных view в найденный контейнер.
8.	Запустите приложение и посмотрите на результат.