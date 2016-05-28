package ru.sbrf.Data.domain;

/**
 * Автомат перечислит все композиты.
 * Для использования в референсах.
 *
 * TODO
 * решить как рекурсивные структуры описывать
 */
public interface ServiceZoneKeyset {
    interface Parties {
        interface Agreements {
            interface Covenants {}
        }
    }
}
