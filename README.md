### Задание
##### Медиана
Даны два отсортированных числовых массива одинаковой длины N. Найдите медиану числового массива длины 2N, содержащего все числа из двух данных массивов.

Пример входных данных:
```
1 2 3 4
1 4 5 6
```

Пример выходных данных:
```
3.5
```
### Запуск
Код в ```src/median.java```

Консоль -> ```cd ./jarFile``` -> ```java -jar median.jar``` 

или (только для windows) в каталоге jarFile запустить ```medianBat.bat```
### Комментарий
Если длина массива четная, то в нем мы ищем в нем два центральных элемента a1 и a2 и медиана будет равна ```(a1+a2)/2```, если массив нечетный, то центральный элемент является медианой.
###### Нюансы:
- В данной задаче разговор идет о четных массивах, поэтому я ставлю проверку на одинаковость длины входных массивов и реализую нахождение медианы только четного массива.
- Не смотря на то, что во входных данных показаны целые числа, в задаче не сказано, что массивы должны быть целочисленными, поэтому я использую массивы float типа.
- Также я использовал классические массивы (к примеру, вместо ArrayList, функционал и динамичность которого мне не нужны), т.к. они намного быстрее.
- В программе использован ввод с клавиатуры
