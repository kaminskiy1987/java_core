Java Core. Seminar 1. Homework
Task
Разработать приложение с лекции все-таки придется.

Создать проект из трёх классов (основной с точкой входа и два класса в другом пакете), которые вместе должны составлять одну программу, позволяющую производить четыре основных математических действия и осуществлять форматированный вывод результатов пользователю (ИЛИ ЛЮБОЕ ДРУГОЕ ПРИЛОЖЕНИЕ НА ВАШ ВЫБОР, которое просто демонстрирует работу некоторого механизма).

Пример моего приложения я прикрепил к материалам урока.

Необходимо установить Docker Desktop. Создать Dockerfile, позволяющий откопировать исходный код вашего приложения в образ для демонстрации работы вашего приложения при создании соответствующего контейнера.

Подобную процедуру мы с вами проделали на уроке, теперь необходимо проделать данную процедуру самостоятельно.


Урок 2. Функции, манипулирующие данными
Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
ЛИБО
доработать игру Змейка:
1. Добавить логику с ядом (Game over при попадании на ячейку с ядом)
2*. Разнести логику и отрисовку
3. И другие улучшения по желанию

Урок 3. Классы и объекты
Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты (сделать статическим) в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
2.(*) Сделать компараторы для Сотрудников на основе ЗП и Возраста

Урок 4. Обработка исключений
реализовать логику приложения Магазин из описания к уроку.

Добавить перечисление с гендерами. В класс покупателя добавить свойство «пол» со значением созданного перечисления. Добавить геттеры, сеттеры.

Добавить в приложение Магазин учет цены товара - в Заказ добавить поле стоимость. Добавить перечисление с размерами скидок - 0, 5, 10, 15, 20%.
Написать метод, при вызове которого на переданный тип товара незначается рандомная скидка из перечисления (меняем значение поля price)

** Товарам добавить категорию. Задать категории Стандарт и Премиум. Если на товар категории Премиум назначилась скидка более 15%, выбросить исключение TooMuchSaleException(msg), сообщение с ошибкой вывести в консоль, цену товара не менять.

Урок 5. Тонкости работы
Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup
Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3], и представляют собой, например, состояния ячеек поля для игры в крестики-нолики, где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3 – резервное значение. Такое предположение позволит хранить в одном числе типа int всё поле 3х3. Записать в файл 9 значений так, чтобы они заняли три байта.
3 (*) - В продолжение 2 дописать "разворачивание" поля игры крестики-нолики из сохраненного в файле состояния (распарсить файл, в зависимости от значений (0-3) нарисовать поле со значками 'х' 'о' '.')