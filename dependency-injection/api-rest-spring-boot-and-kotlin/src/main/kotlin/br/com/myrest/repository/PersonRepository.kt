package br.com.myrest.repository

import br.com.myrest.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : JpaRepository <Person, Long?>