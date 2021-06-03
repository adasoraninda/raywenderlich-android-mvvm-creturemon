package com.raywenderlich.android.creaturemon.model

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CreatureGeneratorTest {

    private lateinit var creatureGenerator:CreatureGenerator

    @Before
    fun setup(){
        creatureGenerator = CreatureGenerator()
    }

    @Test
    fun testGenerateHitPoints(){
        val attributes = CreatureAttributes(
            intelligence = 7,
            strength = 3,
            endurance = 10
        )

        val name ="Rikachu"
        val expectedCreature = Creature(
            attributes = attributes,
            hitPoints = 84,
            name = name
        )

        assertEquals(expectedCreature, creatureGenerator.generateCreature(attributes,name))
    }

}