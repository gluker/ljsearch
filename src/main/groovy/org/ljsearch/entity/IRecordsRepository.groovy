package org.ljsearch.entity

import org.springframework.data.jpa.repository.JpaRepository

import java.time.LocalDate


interface IRecordsRepository extends JpaRepository<Record, String> {

    Set<Record> findByJournalAndDateBetween(String journal, Date dateFrom, Date toFrom)
}
