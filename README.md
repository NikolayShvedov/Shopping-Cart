# Shopping-Cart
REST приложение (Shopping Cart) с использованием Spring
При создании базы данных использовал СУБД PostgreSQL. В БД после запуска приложения должны появиться следующие 4 таблицы:
Customer (id, names, fio, address, email, phone) - Покупатель.
Order (id, order_date, order_status, payment_method, customer_id) – Заказ (customer_id – ссылка на покупателя; 
order_status – принимает одно из created, processing, cancelled, shipped; payment_method – принимает одно из CREDIT_CARD, PAY_PAL, ON_RECEIPT).
Product (id, names, price, description, inStock) – Товар (inStock – логическое поле, есть ли товар в продаже).
OrderDetail (id, order_id, product_id, price, quantity).

В пакете model создать entity для всех таблиц
Работа с БД должна быть организована через спринговый JpaRepository (пакет repository). Jpa-реализация - hibernate
Проект должен быть сделан как maven, при реализации entity Product и OrderDetail использовать Lombok.
Для работы реализовать rest controller-ы со следующим api:

Для Order:
1) Создать заказ (пустой, без товаров);
2) Удалить заказ (удаляется вместе со всеми товарами заказа);
3) Поменять статус заказа;
4) Отобразить заказ по id.

Для OrderDetail:
1) Добавить позицию;
2) Удалить позицию;
3) Отобразить все позиции по order_id.

Для Product – возможность вывести все товары, которые есть в наличие.
