package ru.sbrf.Data.support;

/**
 * Объект в гриде.
 * В некотором смысле ColumnFamily.
 */
public class DbAggregate {

    class Header {
        private String key = null;
        private String movedTo = null; // ключ, куда переместили объект
        long version = 0;
        // TODO версии подобъектов, вошедшие в эту версию, плюс механика апдейта этих полей
        //    @Versioned.commit() должен вызывать обновление версии всех зависимых вверх по иерархии
    }

    //
    // работа с прокси объектами
    //

    //
    // схема
    //

}
