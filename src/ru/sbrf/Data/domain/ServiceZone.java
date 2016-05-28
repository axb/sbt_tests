package ru.sbrf.Data.domain;

import ru.sbrf.Data.support.*;

import java.util.List;

/**
 * пример автосгенерированного класса
 */
@Aggregate
@KeySpaceRoot
public class ServiceZone {

    String Name = null;
    int Status = 0;

    //
    // clients
    //
    List< Party > Parties = null;

    /** TODO
     * serving hosts
     * other info
     */
}
