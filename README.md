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
Консоль -> ```cd ./jarFile``` -> ```java -jar median.jar``` 

или (только для windows) в каталоге jarFile запустить ```medianBat.bat```
### Комментарий

Если длина массива четная, то в нем находится два центральных элемента a1 и a2 и медиана будет равна ```(a1+a2)/2```, если массив нечетный, то центральный элемент является медианой.

В данной задаче разговор идет о четных массивах, поэтому я ставлю проверку на одинаковость размера входных массивов и реализую нахождение медианы только четного массива.
###### Нюансы:
- В задаче не сказано должны ли быть массивы целочисленными, поэтому используем массивы float типа.
- Я использовал классические массивы, т.к. они намного быстрее ArrayList, List и т.д, и мне не нужен их функционал.
- Для объединения массивов написал свой метод ```JoinArrays```, вместо использования метода ```addAll``` библиотеки ```Apache Commons Lang```, т.к. ради одной простой операции удобнее написать свой метод, чем тащить целую библиотеку.
