package ru.sbrf.Data.domain;

import ru.sbrf.Data.support.Aggregate;
import ru.sbrf.Data.support.Versioned;

import java.util.List;

/**
 *
 */
@Aggregate
@Versioned
public class Party {
    public String Name = null;

    public List< Agreement > Agreements = null;
}
