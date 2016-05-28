package ru.sbrf.Data.support;

/**
 * Пространство ключей в гриде.
 */
public class DbKeySpace {

    private Db db = null;
    private SchemaKeySpace schema = null;

    public DbKeySpace( Db db, SchemaKeySpace schema ) {

    }

    DbAggregate get( String key, SchemaAggregate schema ) {
        return null;
    }

    void put( DbAggregate aggr ) {

    }

    void delete ( String key ) {

    }


}
