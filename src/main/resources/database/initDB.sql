create table customer (
    id int8 not null,
    names varchar(30) not null,
    surname varchar(40) not null,
    address varchar(200) not null,
    email varchar(200) not null,
    phone varchar(20) not null,
    primary key (id)
);

create table product (
    id int8 not null,
    names varchar(40) not null,
    price int8 not null,
    description varchar(40) not null,
    in_stock boolean not null,
    primary key (id)
);

create table orders (
    id int8 not null,
    order_date varchar(20) not null,
    order_status varchar(20) not null,
    payment_method varchar(20) not null,
    customer_id int8 REFERENCES customer (id),
    primary key (id)
);

create table orderDetail (
    id int8 not null,
    order_id int8 REFERENCES orders (id),
    customer_id int8 REFERENCES customer (id),
    price int8 not null,
    quantity int8 not null,
    primary key (id)
);