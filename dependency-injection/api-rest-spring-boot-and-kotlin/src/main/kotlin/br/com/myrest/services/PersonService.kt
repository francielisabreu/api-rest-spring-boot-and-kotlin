package br.com.myrest.services

import br.com.myrest.exceptions.ResourceNotFoundException
import br.com.myrest.model.Person
import br.com.myrest.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class PersonService {

    @Autowired
    private lateinit var repository: PersonRepository
    private val logger = Logger.getLogger(PersonService::class.java.name)


    fun findAll(): List<Person> {

        logger.info("encontrar todas as pessoas!")

        return repository.findAll()

    }

    fun findById(id: Long): Person {

        logger.info("encontrar uma pessoa!")

        return repository.findById(id)
            .orElseThrow { ResourceNotFoundException("Nenhum registro encontrado para este ID") }
    }


    fun create(person: Person): Person {

        return repository.save(person)
    }


    fun update(person: Person) {
        val entity = repository.findById(person.id)
            .orElseThrow { ResourceNotFoundException("Nenhum registro encontrado para este ID") }


        entity.firstName = person.firstName
        entity.lastName = person.lastName
        entity.adress = person.adress
        entity.gender = person.gender
    }

    fun delete(id: Long) {
        val entity = repository.findById(id)
            .orElseThrow { ResourceNotFoundException("Nenhum registro encontrado para este ID") }
            repository.delete(entity)
    }


}