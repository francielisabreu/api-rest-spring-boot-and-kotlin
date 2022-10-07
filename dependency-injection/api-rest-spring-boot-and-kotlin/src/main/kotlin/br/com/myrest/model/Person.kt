package br.com.myrest.model

import jakarta.persistence.*


@Entity
@Table(name = "person_table")
data class Person(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(name = "first_name", nullable = false, length = 80)
    var firstName: String = "",

    @Column(name = "last_name", nullable = false, length = 80)
    var lastName: String = "",

    @Column(nullable = false, length = 60)
    var adress: String = "",

    @Column(nullable = false, length = 12)
    var gender: String = ""


)