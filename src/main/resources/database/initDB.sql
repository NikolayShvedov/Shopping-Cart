create table customer (
    id int8 not null,
    names varchar(30),
    surname varchar(40),
    address varchar(200),
    email varchar(200),
    phone varchar(20),
    primary key (id)
);

create table product (
    id int8 not null,
    names varchar(40),
    price int8,
    description varchar(40),
    in_stock boolean,
    primary key (id)
);

create table orders (
    id int8 not null,
    order_date varchar(20),
    order_status varchar(20),
    payment_method varchar(20),
    customer_id int8 REFERENCES customer (id),
    primary key (id)
);

create table orderDetail (
    id int8 not null,
    order_id int8 REFERENCES orders (id),
    product_id int8 REFERENCES product (id),
    price int8,
    quantity int8,
    primary key (id)
);