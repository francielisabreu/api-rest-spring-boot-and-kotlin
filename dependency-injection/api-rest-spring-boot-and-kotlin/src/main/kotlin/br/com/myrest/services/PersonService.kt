package br.com.myrest.services

import br.com.myrest.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PersonService {

    val counter: AtomicLong = AtomicLong()
    private val logger = Logger.getLogger(PersonService::class.java.name)


    fun findAll(): List<Person> {

        logger.info("encontrar todas as pessoas!")

        val persons: MutableList<Person> = ArrayList()

        for (i in 0..7) {
            val person = mockPerson(i)
            persons.add(person)
        }
        return persons

    }

    fun findById(id: Long): Person {

        logger.info("encontrar uma pessoa!")

        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "Francieli"
        person.lastName = "Abreu"
        person.adress = "São - SP, Brasil"
        person.gender = "Female"
        return person

    }


    fun create(person: Person) = person
    fun update(person: Person) = person
    fun delete(id: Long) {}
    private fun mockPerson(i: Int): Person {
        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "Person name $i"
        person.lastName = "Last name $i "
        person.adress = "Some Adress in Brasil"
        person.gender = "Female"
        return person

    }


}