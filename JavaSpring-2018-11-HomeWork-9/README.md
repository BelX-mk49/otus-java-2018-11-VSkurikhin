# java-2018-11-VSkurikhin
## "Разработчик на Spring Framework"

#### (C) 2018-11
##### @Author Виктор Скурихин (Victor Skurikhin)

### HomeWork-9
 * [x] CRUD приложение с Web UI и хранением данных в БД
 * [x] Создайте приложение с хранением сущностей в БД (можно взять DAOs из прошлых занятий)
 * [x] Использовать классический View, предусмотреть страницу отображения всех сущностей и создания/редактирования.
 * [x] View на Thymeleaf, classic Controllers.
## BugList
 * ~~Если зайти на страницу редактирования книги, ввести новый, не существующий в БД жанр, то в этом месте получим исключение~~
 * ~~Очень большой контроллер. Его точно можно разделить, как минимум на 3 к класса~~
 * ~~дать больше информации, вместо пустого исключения~~
 * ~~Удаление с помощью метода POST~~
 * ~~По первому пункту ничего не изменилось: Редактирование первой книги -> Вводим "Information Technology 2" в жанр -> Жмем Save~~