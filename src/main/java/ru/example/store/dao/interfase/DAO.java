package ru.example.store.dao.interfase;

/**
 * Author : Danyil Smirnov.
 * Created : 02/07/2020.
 */
public interface DAO<Entity, Key> {
    void create(Entity entity);
    Entity read(Key key);
    void update(Entity entity);
    void delete(Entity entity);
}