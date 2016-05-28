package ru.sbrf.Data.support;

import java.util.List;

/**
 * Описание агрегата.
 */
@Aggregate
public class SchemaAggregate {
    String Type = null;
    List<SchemaAggregateItem> items = null;
}
